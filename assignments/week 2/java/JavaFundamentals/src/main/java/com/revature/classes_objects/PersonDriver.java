package com.revature.classes_objects;

public class PersonDriver {
    public static void main(String[] args) {
        Person bryan = new Person("Bryan", 71.75, 250.5, 25);
        Person kaitlyn = new Person ("Kaitlyn", 68.5, 135.6, 24);
        System.out.println(bryan.name);
        System.out.println(kaitlyn.weight);
        kaitlyn.walk(1000);
        Person jimmy = new Person();
        jimmy.walk(6);
        System.out.println(jimmy.talk());
        Person sam = new Person("Sam");
        System.out.println(sam.talk());
    }
}
