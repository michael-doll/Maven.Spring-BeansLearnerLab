package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    /*The class should define a bean named currentCohort() which returns a Classroom object whose dependencies are instructors and students */
    @Bean(name="current cohort")
    @Autowired
    public Classroom currentCohort(Instructors instructors, @Qualifier("current students") Students students){
        return new Classroom(students, instructors);
    }
    /*The class should define a bean named previousCohort() which returns an Classroom object whose dependencies are instructors and previousStudents */
    @Bean(name="previous cohort")
    @Autowired
    public Classroom previousCohort(Instructors instructors, @Qualifier("previous students") Students students){
        return new Classroom(students, instructors);
    }

}
