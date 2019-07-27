package cn.itsource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy  //开启网管
@EnableEurekaClient //表示为eurea客户端  可不写
public class ZuulApplication {

    public static void main(String[] args) {

        SpringApplication.run(ZuulApplication.class,args);
    }
}
