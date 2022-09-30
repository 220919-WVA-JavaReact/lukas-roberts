package com.revature.arrays;

import java.util.Arrays;

public class ArraysDriver {
    public static void main(String[] args) {
        int[] anArray;
        anArray = new int[10];
        // can combine int[] anArray = new int[10];
        // can also declare an array like this:
        // int[] anArray = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000}
        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        // multidimensional arrays
        String[][] names = {
                {"Scott", "Jack", "Sirius"},
                {"Pilgrim", "Black", "Smith"}
        };
        // for Jack Black
        System.out.println(names[0][1] + " " + names[1][1]);

        // to copy array
        int[] copiedArray = new int[5];
        System.arraycopy(anArray, 3, copiedArray, 0, 5);
        for (int num : copiedArray) {
            System.out.println(num);
        }

        // Array manipulation
        int[] copiedArray2 = Arrays.copyOfRange(anArray, 2, 7);
        for (int num : copiedArray2) {
            System.out.println(num);
        }

        // get index of certain value in array
        System.out.println(Arrays.binarySearch(copiedArray2, 600));

        // see if 2 arrays are equal
        System.out.println(Arrays.equals(copiedArray, copiedArray2));

        // for sorting use Arrays.sort for small arrays, and Arrays.parallelSort for larger arrays
        // to create a stream and print out like before
        Arrays.stream(copiedArray2).map(num -> num).forEach(System.out::print);

        // to convert array to string use toString()
        System.out.println(Arrays.toString(anArray));
    }
}
