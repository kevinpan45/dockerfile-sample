FROM nginx:latest
COPY server.crt /etc/nginx
COPY server.key /etc/nginx
ADD static /usr/share/nginx/html/static
ADD index.html /usr/share/nginx/html
COPY nginx.conf /etc/nginx/conf.d/nginx.conf