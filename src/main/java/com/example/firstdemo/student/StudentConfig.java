package com.example.firstdemo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mehran = new Student(
                    "Mehran",
                    "mehranj73@gmail.com",
                    LocalDate.of(1994, Month.JANUARY, 5)
            );

            Student shiva = new Student(
                    "Shiva",
                    "shivaeb@gmail.com",
                    LocalDate.of(1993, Month.JANUARY, 5)
            );

            repository.saveAll(
                    List.of(mehran, shiva)
            );

        };
    }
}
