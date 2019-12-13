package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {

    /*The class should define a bean named tcUsaInstructors() which returns an Instructors representative of the Tech Connect USA instructors.*/
    @Bean(name="Instructors")
    public Instructors tcUsaInstructors(){return null;}
    /*The class should define a bean named tcUkInstructors() which returns an Instructors representative of the Tech Connect UK instructors. */
    @Bean(name="Instructors")
    public Instructors tcUkInstructors(){return null;}
    /*The class should define a bean named instructors which returns all Instructors employed at ZipCodeWilmington  */
    /*this ensures Spring will inject this bean in the case that an Autowire annotation is not supplied with a Qualifier annotation*/
    @Primary
    @Bean(name="Instructors")
    public Instructors instructors(){return null; }
}
