package com.revature.collection_exercises;

import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {
        // 1. Write a Java program to append the specified element to the end of a hash set
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Blue");
        System.out.println(colors);


        // 2. Write a Java program to iterate through all elements in a hash list.
        for (String color : colors) {
            System.out.println(color);
        }


        // 3. Write a Java program to get the number of elements in a hash set
        int numberOfElementsInHashSet = colors.size();
        System.out.println("Colors has " + numberOfElementsInHashSet + " elements");

        // 4. Write a Java program to test a hash set is empty or not
        boolean isEmpty = colors.isEmpty();
        System.out.println("Is Colors empty? " + isEmpty);


        // 5. Write a Java program to convert a hash set to an array.
        String[] arrColors = colors.toArray(new String[colors.size()]);
        for (String color : arrColors) {
            System.out.println(color);
        }
    }
}
