package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student meryem = new Student(
                    "Meryem",
                    "meryem@gmail.com",
                    LocalDate.of(2000, Month.APRIL, 5)
            );

            Student alex = new Student(
                    "alex",
                    "alex@gmail.com",
                    LocalDate.of(1990, Month.APRIL, 5)
            );

            repository.saveAll(
                    List.of(meryem, alex)
            );
        };
    }
}
