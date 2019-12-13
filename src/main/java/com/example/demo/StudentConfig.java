package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    /*The class should define a method named currentStudents() which returns a Students representative of the current cohort of students. */
    @Bean(name="students")
    public Students currentStudents(){ return null; }
    /*The class should define a bean named previousStudents() which returns a Students representative of the previous cohort of students. */
    @Bean(name="students")
    public Students previousStudents(){ return null; }

}
