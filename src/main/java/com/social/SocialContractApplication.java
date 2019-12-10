package com.social;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.social.mapper")
public class SocialContractApplication {

    public static void main(String[] args) {
        SpringApplication.run(SocialContractApplication.class, args);
    }
}
