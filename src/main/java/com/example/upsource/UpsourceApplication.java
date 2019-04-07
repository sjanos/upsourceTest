package com.example.upsource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UpsourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UpsourceApplication.class, args);
    }

    @Bean
    public String stringBean(){
        return "BEAN";
    }

}
