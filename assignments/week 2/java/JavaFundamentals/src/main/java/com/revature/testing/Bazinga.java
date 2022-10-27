package com.revature.testing;

public class Bazinga {
/*
        Given an integer n, return a string array, answer, where
        if 'i + 1' is divisible by 3   answer[i] == "baz"     .
        if 'i + 1' is divisible by 7  answer[i] == "inga"      .
        answer[i] == "BAZINGA". if 'i + 1' is divisible by 3 and 7
        answer[i] == "i + 1" as a string if 'i + 1' is not divisible 3 or 7  .

        example bazinga(3) should return ["1", "2", "baz"]
                bazinga(7) should return ["1", "2", "baz", "4", "5", "baz", "inga"]

 */

    public static String[] bazinga(int n) {
        // your code goes here
        String[] array = new String[n];

        for (int i = 0; i < n; i++) {
            if ((i + 1) % 3 == 0 && (i + 1) % 7 == 0){
                array[i] = "BAZINGA";
            } else if((i + 1) % 3 == 0) {
                array[i] = "baz";
            } else if ((i + 1) % 7 == 0) {
                array[i] = "inga";
            }
            else {
                array[i] = Integer.toString(i + 1);
            }
        }

        return array;// return your array here
    }


    public static String math(int a, int b, int c, int d) {
        long x = a * b;
        long y = c * d;
        long z = x + y;
        if (z % 2 == 0) {
            return "even";
        }
        return "odd";
    }
}
