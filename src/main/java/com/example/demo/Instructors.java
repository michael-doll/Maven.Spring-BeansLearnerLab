package com.example.demo;

public class Instructors extends People<Instructor> {
    //Create a Instructors class
    //    The class should be a subclass of People of parameterized type Instructor.
    //    The class should consume a variable number of Instructor objects upon construction and pass them to the super constructor.
    public Instructors(Instructor...instructors){super(instructors);}
}
