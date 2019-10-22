
# Full function service Dockerfile

## Install openresty by source code
    RUN wget https://openresty.org/download/openresty-1.15.8.1.tar.gz
    RUN tar -xvf openresty-1.15.8.1.tar.gz
    RUN cd openresty-1.15.8.1 ; ./configure -j2 ; make -j2 ; make install
    RUN export PATH=/usr/local/openresty/bin:$PATH
