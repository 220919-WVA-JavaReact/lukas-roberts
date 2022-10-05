package com.revature.collection_exercises;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        // 1. Create a HashMap with Integers for the Keys and Strings for the Entries. Insert 5 entries with numbers as
        // the key and colors as the value associated
        HashMap<Integer, String> colors = new HashMap<Integer, String>();
        colors.put(0, "Red");
        colors.put(1, "Blue");
        colors.put(2, "Yellow");
        colors.put(3, "Green");
        colors.put(4, "Purple");
        System.out.println("Colors HashMap after being created: " + colors);

        // 2. Write a Java program to count the number of key-value (size) mappings in a map.
        int size = colors.size();
        System.out.println("The colors HashMap has a size of: " + size);

        // 3. Write a Java program to test if a map contains a mapping for the specified key
        boolean containsSpecificKey = colors.containsKey(7);
        System.out.println("Does Colors contain a key of 7: " + containsSpecificKey);

        // 4. Write a Java program to get the value of a specified key in a map.
        String valueOfSpecificKey = colors.get(3);
        System.out.println("The value at key 3 is: " + valueOfSpecificKey);

        // 5. Write a Java program to get a set view of the keys contained in this map.
        System.out.println("The keys contained in Colors are: " + colors.keySet());

    }
}
