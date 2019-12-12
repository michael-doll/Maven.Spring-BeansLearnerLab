package com.example.demo;

import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getId() {
        Long expected = 1L;
        Long actual;
        Person person = new Person(1L,"Henry");
        actual = person.getId();
        assertEquals(expected,actual);
    }

    @Test
    void getName() {
        String expected = "Henry";
        String actual;
        Person person = new Person(1L,"Henry");
        actual = person.getName();
        assertEquals(expected,actual);

    }

    @Test
    void setName() {
        String expected = "Henry";
        String actual;
        Person person = new Person(1L,null);
        person.setName(expected);
        actual = person.getName();
        assertEquals(expected,actual);
    }
}