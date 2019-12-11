package com.example.demo;

public class Student extends Person implements Learner{
    private double totalStudyTime;

    @Override
    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
