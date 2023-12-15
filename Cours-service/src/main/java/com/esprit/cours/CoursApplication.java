package com.esprit.cours;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CoursApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoursApplication.class, args);
    }


    @Autowired
    private CoursRepository repository ;

    @Bean
    ApplicationRunner init(){
        return (args )-> {
            repository.save(new Cours("actif","Ch","ma@esprit.tn","pdf")) ;
            repository.save(new Cours("actif","Ab","sa@esprit.tn","pdf")) ;
            repository.save(new Cours("actif","Ch","ma@esprit.tn","pdf")) ;
            repository.findAll().forEach(System.out::println);
        };
    }
}
