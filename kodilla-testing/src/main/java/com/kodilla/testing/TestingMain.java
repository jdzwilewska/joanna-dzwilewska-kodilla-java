package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int resultAdd = calculator.add(4, 2);

        // test dodawania
        if (resultAdd == 6) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // test odejmowania
        int resultSubstr = calculator.subtract(8, 5);
        if (resultSubstr == 3) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
