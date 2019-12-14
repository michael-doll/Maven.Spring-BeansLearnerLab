package com.example.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.ArrayList;
import java.util.List;

public class TestInstructorConfig {

    @Autowired
    @Qualifier("tcUsaInstructors")
    Students tcUsaInstructors;

    @Autowired
    @Qualifier("tcUkInstructors")
    Students tcUkInstructors;

    @Autowired
    @Qualifier("zipCodeWilmington Instructors")
    Students instructors;

    @Test
    public void testTcUsaInstructors(){
        InstructorsConfig instructorsConfig = new InstructorsConfig();
        String expected = "Al Kooper";
        String actual = instructorsConfig.tcUsaInstructors().findById(1L).getName() ;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testTcUkInstructors(){
        InstructorsConfig instructorsConfig = new InstructorsConfig();
        String expected = "Ginger Baker";
        String actual = instructorsConfig.tcUkInstructors().findById(1L).getName() ;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testInstructors(){
        InstructorsConfig instructorsConfig = new InstructorsConfig();
        String expected = "Jorma";
        String actual = instructorsConfig.instructors().findById(1L).getName() ;
        Assert.assertEquals(expected,actual);
    }

}
