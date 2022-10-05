package com.revature.collection_exercises;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        // 1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Purple");
        colors.add("Orange");
        colors.add("Yellow");
        System.out.println("Colors ArrayList after being created: " + colors);


        // 2. Write a Java program to iterate through all elements in an array list
        for (String color : colors) {
            System.out.println(color + " is at index " + colors.indexOf(color));
        }


        // 3. Write a Java program to insert an element into the array list at the first position
        colors.add(0, "Green");
        System.out.println("Color at index 0: " + colors.get(0));


        // 4. Write a Java program to retrieve an element (at a specified index) from a given array list
        String colorAtIndex0 = colors.get(2);
        System.out.println("Color at specified index 2: " + colorAtIndex0);


        // 5. Write a Java program to remove the third element from an array list.
        colors.remove(2);
        System.out.println("Colors after removing index 2: " + colors);

        // 6. Write a Java program to search an element in an array list.
        boolean doesContainRed = colors.contains("Red");
        System.out.println("Does colors contain the color 'Red': " + doesContainRed);

        // 7. Write a Java program to sort a given array list.
        System.out.println("Colors before being sorted: " + colors);
        Collections.sort(colors);
        System.out.println("Colors after being sorted: " + colors);
    }
}
