package com.example.firstdemo;

import com.example.firstdemo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import static java.util.List.of;

@SpringBootApplication
@RestController
public class FirstDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstDemoApplication.class, args);
    }

    @GetMapping
    public List<Student> hello() {
        return List.of(
                new Student(
                        1L, "Mariam", "mj@gmail.com", LocalDate.of(2000, Month.JANUARY, 5), 21
                )

        );

    }

}
