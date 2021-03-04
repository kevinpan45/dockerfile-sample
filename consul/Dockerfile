FROM consul:1.9.3
RUN apk --update add nginx && \
    adduser -D -g 'www' www && \
    mkdir /www && \
    chown -R www:www /var/lib/nginx && \
    chown -R www:www /www
RUN mkdir /run/nginx
VOLUME ["/var/cache/nginx"]
COPY nginx.conf /etc/nginx/nginx.conf
COPY index.html /www/index.html
COPY docker-entrypoint.sh /usr/local/bin/docker-entrypoint.sh
RUN chmod a+x /usr/local/bin/docker-entrypoint.sh
ENTRYPOINT ["/usr/local/bin/docker-entrypoint.sh"]
CMD ["agent", "-dev", "-client", "0.0.0.0"]