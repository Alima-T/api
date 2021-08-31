package com.example.api.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration// аннотация на уровне класса, указывающая, что объект является источником определений bean-компонентов.
public class StudentConfiguration {
    @Bean
    public CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            studentRepository.saveAll(List.of(
                new Student("Alex", LocalDate.of(2000, Month.JANUARY, 1)),
                new Student("Tom", LocalDate.of(2002, Month.NOVEMBER, 11)
            )));
        };
    }
}