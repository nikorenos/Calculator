package com.kodilla.calculator;

import java.util.LinkedList;

public class Calculator {


    public static Double addition(final double x, final double y) {
        return x + y;
    }
    public static Double subtraction (final double x, final double y) {
        return x - y;
    }


    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Addition: " + calculator.addition(2.5,10));
        System.out.println("Substraction: " + calculator.subtraction(2.5,10));


    }
}