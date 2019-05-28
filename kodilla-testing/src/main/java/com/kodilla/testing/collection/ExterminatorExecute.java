package com.kodilla.testing.collection;

import java.util.*;
import java.util.Random;

public class ExterminatorExecute {
        public static void main(String[] args) throws java.lang.Exception {

            ArrayList<Integer> numbers = new ArrayList <Integer> ();
            Random generator = new Random();
            for (int n = 0; n < 100; n++) {
                numbers.add(generator.nextInt(100));
            }
            ArrayList <Integer> evenNumbers = new ArrayList <Integer> ();

            OddNumbersExterminator exterminator = new OddNumbersExterminator();
            exterminator.exterminate(numbers);
        }
}
