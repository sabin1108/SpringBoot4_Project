package com.inspirecamp7.myspringbootproject4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class MySpringBootProject4Application {

    public static void main(String[] args) {
        SpringApplication.run(MySpringBootProject4Application.class, args);
    }

    @Bean
    public String helloBean() {
            return new String("hello 스프링부터");
    }
}





