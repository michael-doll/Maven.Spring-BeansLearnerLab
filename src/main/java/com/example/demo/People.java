package com.example.demo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {
    List<PersonType> personList;
    public People(List<PersonType> personList){
           this.personList = personList;
    }
    public People(PersonType... personType){
        this.personList.addAll(Arrays.asList(personType));
    }

    public void add (PersonType personType){
        this.personList.add(personType);
    }

    public void remove (PersonType personType){
        if(personList.contains(personType))
        this.personList.remove(personType);
    }

    public int size (){
        return this.personList.size();
    }

    public void clear (){
        this.personList.clear();
    }

    public void addAll(Iterable<PersonType> iter){
        for(PersonType p : iter){
            personList.add(p);
        }
    }

    public PersonType findById(Long Id){
        for(PersonType p : personList){
            if(p.getId().equals(Id)){
                return p;
            }
        }
        return null;
    }

    public List findAll(){
        return this.personList;
    }

    public Iterator<PersonType> iterator(){return personList.iterator();}


    //Create an abstract People class
    //
    //    The class signature should be parameterized with PersonType such that PersonType is a sub class of Person.
    //    The class should implement Iterable of type PersonType.
    //    Upon construction People should consume a List of PersonType and set it to a respective personList field.
    //    The class should define a constructor which consumes a variable number of PersonType objects and sets the personList field respectively.
    //    The class should define a method named add which adds a PersonType to the personList.
    //    The class should define a method named remove which removes a PersonType from the personList.
    //    The class should define a method named size which returns the size of personList.
    //    The class should define a method named clear which clears our personList field.
    //    The class should define a method named addAll which adds an Iterable of PersonType objects to the composite personList.
    //        This method will NOT take an argument of Collection<PersonType>
    //    The class should define a method named findById which makes use of a long id parameter to return a PersonType object with the respective id field.
    //    The class should define a method named findAll which returns the composite personList.
}
