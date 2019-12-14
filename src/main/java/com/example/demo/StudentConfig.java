package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {

    /*The class should define a method named currentStudents() which returns a Students representative of the current cohort of students. */
    @Bean(name="current students")
    public Students currentStudents(){
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student(1L,"Henry"));
        studentsList.add(new Student(2L, "Andre"));
        studentsList.add(new Student(3L, "Harry"));
        return new Students(studentsList);
    }
    /*The class should define a bean named previousStudents() which returns a Students representative of the previous cohort of students. */
    @Bean(name="previous students")
    public Students previousStudents(){
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student(1L,"Bart"));
        studentsList.add(new Student(2L, "Ace"));
        studentsList.add(new Student(3L, "Ginger"));
        return new Students(studentsList);
    }

}
