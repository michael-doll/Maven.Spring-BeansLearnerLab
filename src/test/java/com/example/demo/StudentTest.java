package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getTotalStudyTime() {
        Student student = new Student(1L,"Harry");
        Double expected = 10.0;
        Double actual;
        student.learn(expected);
        actual = student.getTotalStudyTime();
        assertEquals(expected, actual);
    }
}