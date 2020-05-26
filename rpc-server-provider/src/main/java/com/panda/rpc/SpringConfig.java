package com.panda.rpc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.panda.rpc")
public class SpringConfig {

    @Bean(name = "myRpcServer")
    public MyRpcServer myRpcServer() {
        return new MyRpcServer(8080);
    }
}
