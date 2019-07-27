package cn.itsource.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EuakaServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(EuakaServerApplication.class,args);
    }
}
