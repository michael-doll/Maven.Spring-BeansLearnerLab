package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    /*The class should define a bean named currentCohort() which returns a Classroom object whose dependencies are instructors and students */
    @Bean("classroom")
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(){return null;}
    /*The class should define a bean named previousCohort() which returns an Classroom object whose dependencies are instructors and previousStudents */
    @Bean("classroom")
    @DependsOn({"instructors", "previousStudents"})
    public Classroom previousCohort(){return null;}

}
