package io.kp45.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloService {
    @Autowired
    private HelloMapper helloMapper;

	public Hello findLatest() {
		return helloMapper.findLatest();
	}

	public void say(String msg) {
        helloMapper.say(msg);
	}

}