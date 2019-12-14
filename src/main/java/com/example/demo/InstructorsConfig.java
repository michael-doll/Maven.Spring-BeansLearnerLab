package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InstructorsConfig {

    /*The class should define a bean named tcUsaInstructors() which returns an Instructors representative of the Tech Connect USA instructors.*/
    @Bean(name="tcUsaInstructors")
    public Instructors tcUsaInstructors(){
        List<Instructor>instructorsList = new ArrayList<>();
        instructorsList.add(new Instructor(1L,"Al Kooper"));
        instructorsList.add(new Instructor(2L,"Paul Butterfield"));
        return new Instructors(instructorsList);
    }
    /*The class should define a bean named tcUkInstructors() which returns an Instructors representative of the Tech Connect UK instructors. */
    @Bean(name="tcUkInstructors")
    public Instructors tcUkInstructors(){
        List<Instructor>instructorsList = new ArrayList<>();
        instructorsList.add(new Instructor(1L,"Ginger Baker"));
        instructorsList.add(new Instructor(2L,"Jack Bruce"));
        return new Instructors(instructorsList);
    }
    /*The class should define a bean named instructors which returns all Instructors employed at ZipCodeWilmington  */
    /*this ensures Spring will inject this bean in the case that an Autowire annotation is not supplied with a Qualifier annotation*/

    @Bean(name="zipCodeWilmington Instructors")
    @Primary
    public Instructors instructors(){
        List<Instructor>instructorsList = new ArrayList<>();
        instructorsList.add(new Instructor(1L,"Jorma"));
        instructorsList.add(new Instructor(2L,"Janice"));
        return new Instructors(instructorsList);
    }
}
