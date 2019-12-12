package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructorTest {

    @Test
    void teach() {
        Instructor instructor = new Instructor();
        Student student = new Student();
        Double expected = 10.0;
        Double actual;
        instructor.teach(student, expected);
        actual = student.getTotalStudyTime();
        assertEquals(expected, actual);
    }

    @Test
    void lecture() {
    }
}