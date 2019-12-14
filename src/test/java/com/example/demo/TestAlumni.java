package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAlumni {


    @Autowired
    @Qualifier("previous students")
    Students previousStudents;

    @Autowired
    @Qualifier("zipCodeWilmington Instructors")
    Instructors instructors;

    @Test
    public void testExecuteBootCamp(){
        Double expected = 1200.;
        for(Student stu : previousStudents){
            Assert.assertEquals(expected, stu.getTotalStudyTime(),.01);
        }
    }

}
