package com.prueba.shura.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.prueba.shura.modules")
@EntityScan("com.prueba.shura.modules")
@ComponentScan("com.prueba.shura")
public class ShuraApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShuraApplication.class, args);
    }

}
