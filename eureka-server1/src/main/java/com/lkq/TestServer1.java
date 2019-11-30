package com.lkq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**eureka的配置
 * EnableEurekaServer
 */
@SpringBootApplication
@EnableEurekaServer
public class TestServer1 {
    public static void main(String[] args) {
        SpringApplication.run(TestServer1.class);
    }
}
