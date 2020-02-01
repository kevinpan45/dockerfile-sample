package io.kp45.hello;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {

    @Autowired
    private HelloService helloService;

    @Autowired
    private StringRedisTemplate redisTemplate;

    private static final String CACHE_KEY = "hello";

    @GetMapping("/hello")
    public String listen() {
        return helloService.findLatest().getMsg();
    }

    @GetMapping("/hello/history")
    public Set<String> history() {
        return redisTemplate.opsForSet().members(CACHE_KEY);
    }

    @PostMapping("/hello")
    public String say(@RequestParam String msg) {
        helloService.say(msg);
        redisTemplate.opsForSet().add(CACHE_KEY, msg);
        return "Hello msg send.";
    }
}