package com.example.demo;

public class Person {
    private final Long id; //final, look further into this
    private String name;

    public Person(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
