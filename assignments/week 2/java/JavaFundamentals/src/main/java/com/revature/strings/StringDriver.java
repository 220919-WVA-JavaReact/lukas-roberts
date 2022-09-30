package com.revature.strings;

public class StringDriver {
    public static void main(String[] args) {
        String text = "This is a String";
        String text2 = new String("This is also a string");
        String helloWorld = "Hello";
        helloWorld += " world";
        System.out.println(helloWorld);
        addOn(helloWorld);
        System.out.println(helloWorld);
        helloWorld = addOn(helloWorld);
        System.out.println(helloWorld);

        String s1 = "Apple";
        String s2 = "Mango";
        String s3 = "Apple";

        System.out.println(s1 == s2); // false
        System.out.println(s1 == s3); // true

        String s4 = new String("Mango");
        System.out.println(s2 == s4); // false
        String s5 = new String("Mango");
        System.out.println(s4 == s5); // false
        System.out.println(s2.equals(s4)); // true
        System.out.println(s4.equals(s5)); // true

        String evenString = new String("This is an even string");
        System.out.println(isEven(evenString));
    }

    public static String addOn(String text) {
        return text + " adding onto the end";
    }

    public static boolean isEven (String text) {
        if (text.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static String repeatSpace(String text, int count) {
        String x = new String("");
        for (int i = 0; i < count; i++) {
            x += text;
            x += " ";
        }

        return x;
    }
}
