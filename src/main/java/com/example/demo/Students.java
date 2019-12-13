package com.example.demo;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Students extends People<Student> {
    public Students(Student... student){
        super(student);
    }
}
