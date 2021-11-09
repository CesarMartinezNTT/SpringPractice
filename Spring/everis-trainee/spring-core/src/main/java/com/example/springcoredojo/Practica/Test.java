package com.example.springcoredojo.Practica;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackageClasses = Alumno.class)
public class Test {
    @Bean
    public Alumno getAddress() {
        return new Alumno("Cesar", "Martinez Guerrero",20);
    }
}
