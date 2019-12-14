package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.constraints.AssertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestStudentConfig {
    @Autowired
    @Qualifier("current students")
    Students currentStudents;

    @Autowired
    @Qualifier("previous students")
    Students previousStudents;

    @Test
    public void testCurrentStudents(){
        StudentConfig studentConfig = new StudentConfig();
        String expected = studentConfig.currentStudents().personList.get(0).getName();
        String actual = "Henry";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPreviousStudents(){
        StudentConfig studentConfig = new StudentConfig();
        String expected = studentConfig.previousStudents().personList.get(0).getName();
        String actual = "Bart";
        Assert.assertEquals(expected, actual);
    }
}
