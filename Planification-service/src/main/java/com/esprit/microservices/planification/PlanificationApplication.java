package com.esprit.microservices.planification;

import com.esprit.microservices.planification.entity.Planification;
import com.esprit.microservices.planification.repository.PlanificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Date;

import static org.apache.http.client.utils.DateUtils.parseDate;

@SpringBootApplication
public class PlanificationApplication {
    public LocalDate parseDate(String dateString) {
        return LocalDate.parse(dateString);
    }


    public static void main(String[] args) {

        SpringApplication.run(PlanificationApplication.class, args);
    }
    @Autowired
    private PlanificationRepository repository;
    @Bean
    ApplicationRunner init(){
        return (args) -> {
            //repository.save(new Planification("Événement 1", "Localisation 1",parseDate("2023-12-01"), 50.0f));
            //repository.save(new Planification("Événement 2", "Localisation 2", parseDate("2023-12-15"), 75.0f));
            //repository.save(new Planification("Événement 3", "Localisation 3", parseDate("2023-12-31"), 100.0f));

            repository.findAll().forEach(System.out::println);

        };
    }

}
