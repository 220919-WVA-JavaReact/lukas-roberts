package com.revature.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        boolean running = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Let's perform some calculations!");
        String operator;
        while (running) {
            System.out.println("For addition: type 'addition', for subtraction: type 'subtraction'");
            System.out.println("For multiplication: type 'multiplication', for division: type 'division'");
            System.out.println("Type 'quit' to exit.");
            operator = input.nextLine();
            while (!operator.equals("addition") && !operator.equals("subtraction") && !operator.equals("multiplication") && !operator.equals("division") && !operator.equals("quit")) {
                System.out.println("Invalid option.");
                System.out.println("For addition: type 'addition', for subtraction: type 'subtraction'");
                System.out.println("For multiplication: type 'multiplication', for division: type 'division'");
                operator = input.nextLine();
            }
            if (operator.equals("quit")) {
                System.out.println("See ya later, alligator");
                running = false;
                break;
            }
            System.out.println("Now, enter a number.");
            double num1 = input.nextDouble();
            System.out.println("Enter another number.");
            double num2 = input.nextDouble();
            if (operator.equals("addition")) {
                System.out.println(num1 + " + " + num2 + " = " + addition(num1, num2));
            } else if (operator.equals("subtraction")) {
                System.out.println(num1 + " - " + num2 + " = " + subtraction(num1, num2));
            } else if (operator.equals("multiplication")) {
                System.out.println(num1 + " * " + num2 + " = " + multiplication(num1, num2));
            } else {
                System.out.println(num1 + " / " + num2 + " = " + division(num1, num2));
            }
            input.nextLine();
            System.out.println("Wanna go again?");
        }

    }

    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }
}
