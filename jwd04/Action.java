package com.jwd04;

import java.util.Scanner;

public class Action {
    private String element;

    Action() {
        this.element = "";
    }

    public void add(String line) {
        this.element = line;
    }

    public boolean isExit(){
        return this.element.equals("exit");
    }

    public String element() {
        return this.element;
    }

    public static void helpCase() {
        System.out.println("\n'+' - You can add one number to another\n" +
                "'-' - You can decrease one number on another\n" +
                "'*' - You can multiply two numbers\n" +
                "'/' - You can divide one number on another\n" +
                "If you enter wrong helpword you'll see message about it\n");
    }

    public static void divisionCase() {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        System.out.println("Enter first number: ");
        num1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        num2 = scanner.nextDouble();
        System.out.println("Solution of " + num1 + " / " + num2 + " = " + (num1 / num2));
    }

    public static void multiplicationCase() {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        System.out.println("Enter first number: ");
        num1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        num2 = scanner.nextDouble();
        System.out.println("Solution of " + num1 + " * " + num2 + " = " + (num1 * num2));
    }

    public static void minusCase() {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        System.out.println("Enter first number: ");
        num1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        num2 = scanner.nextDouble();
        System.out.println("Solution of " + num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public static void plusCase() {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        System.out.println("Enter first number: ");
        num1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        num2 = scanner.nextDouble();
        System.out.println("Solution of " + num1 + " + " + num2 + " = " + (num1+num2));
    }

    public static void defaultCase() {
        System.out.println("I'm sorry, but you enter wrong sign or helpword, try again: ");
    }

}
