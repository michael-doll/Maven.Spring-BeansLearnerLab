package com.example.demo;

public class Instructor extends Person implements Teacher {

    @Override
    public void teach(Learner learner, double numberOfHours) {
    learner.learn(numberOfHours);
    }

    //?******
    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        int numberOfLearners = 0;
        for(Learner stu : learners){
            numberOfLearners++;
        }
        double numbeOfHoursPerLearner = numberOfHours/numberOfLearners;
        for(Learner stu : learners){
            stu.learn(numbeOfHoursPerLearner);
        }
    }
}
