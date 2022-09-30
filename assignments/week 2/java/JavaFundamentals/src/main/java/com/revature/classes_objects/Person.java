package com.revature.classes_objects;

public class Person {
    /*
    * Every person has:
    * name --> String
    * height --> double
    * weight --> double
    * age --> int
    */

    String name;
    double height;
    double weight;
    int age;

    public Person (String name, double height, double weight, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public Person () {
        this.name = "Jimmy";
        this.height = 67;
        this.weight = 180;
        this.age = 34;
    }

    public Person (String name) {
        this.name = name;
        this.height = 72;
        this.weight = 120;
        this.age = 19;
    }

    public void walk (int distance) {
        System.out.println(this.name + " walked a distance of " + distance + " feet");
    }

    public String talk () {
        return "Hi, my name is " + this.name;
    }
}
