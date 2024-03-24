package org.example.config;


import org.example.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {

    @Bean
    public Desktop desktop(){
        return new Desktop();
    }
}
