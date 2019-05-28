package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;
import java.io.*;

public class OddNumbersExterminator {
    ArrayList <Integer> evenNumbers;

    public OddNumbersExterminator() {
        evenNumbers = new ArrayList <Integer> ();
    }

    public ArrayList <Integer> exterminate(ArrayList <Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                //System.out.println(number);
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}





