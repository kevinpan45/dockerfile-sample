FROM centos/mysql-80-centos7
MAINTAINER kp45
# mysql configuration
ENV MYSQL_USER=root
ENV MYSQL_PASSWORD=123456
USER root
# install system tools
RUN yum install -y wget lrzsz vim net-tools zip unzip epel-release yum-utils pcre-devel openssl-devel gcc curl make
# install java
RUN yum install -y java-1.8.0-openjdk.x86_64
# install redis
RUN yum install -y http://rpms.remirepo.net/enterprise/remi-release-7.rpm
RUN yum-config-manager --enable remi
RUN yum install -y redis
# install openresty
RUN yum-config-manager --add-repo https://openresty.org/package/centos/openresty.repo
RUN yum install -y openresty openresty-resty
