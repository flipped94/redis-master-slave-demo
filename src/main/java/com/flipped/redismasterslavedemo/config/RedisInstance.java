package com.flipped.redismasterslavedemo.config;

import lombok.Data;

@Data
public class RedisInstance {

    private String host;
    private int port;

    String getHost() {
        return host;
    }

    void setHost(String host) {
        this.host = host;
    }

    int getPort() {
        return port;
    }

    void setPort(int port) {
        this.port = port;
    }
}