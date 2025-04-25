package com.example.anotaion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public MyComponent getComponent(){
        return new MyComponent();
    }
}