package com.example.demo;

import java.util.ArrayList;

public class Instructor extends Person implements Teacher {

    public Instructor(Long id, String name){
        super(id, name);
    }

    @Override
    public void teach(Learner learner, Double numberOfHours) {
    learner.learn(numberOfHours);
    }

    //?******
    @Override
    public void lecture(Iterable<? extends Learner> learners, Double numberOfHours) {
//        int numberOfLearners = 0;
//        for(Learner stu : learners){
//            numberOfLearners++;
//        }
//        double numbeOfHoursPerLearner = numberOfHours/numberOfLearners;
//        for(Learner stu : learners){
//            stu.learn(numbeOfHoursPerLearner);
        ArrayList<Learner> learnerArrayList = new ArrayList<>();
        for(Learner l : learners){
            learnerArrayList.add(l);
        }
        for(Learner l : learnerArrayList){
            l.learn(numberOfHours/learnerArrayList.size());
        }
    }
}
