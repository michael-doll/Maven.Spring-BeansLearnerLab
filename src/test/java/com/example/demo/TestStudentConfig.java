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
        System.out.println(studentConfig.currentStudents().personList.get(1));
        Assert.assertEquals(1,1);
    }
}
