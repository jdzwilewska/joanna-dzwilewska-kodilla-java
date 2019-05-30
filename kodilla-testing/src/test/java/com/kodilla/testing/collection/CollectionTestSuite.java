package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import com.kodilla.testing.collection.ExterminatorExecute;
import org.junit.After;
import org.junit.Assert;
import java.util.*;

import org.junit.Before;
import org.junit.Test;

public class CollectionTestSuite {
    @Before
    public void beforeFirst(){
        System.out.println("Przypadek testowy - początek: testOddNumbersExterminatorEmptyList()");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<Integer> ();

        //When
        OddNumbersExterminator exterminatorTest = new OddNumbersExterminator();
        ArrayList<Integer> newEmpty = exterminatorTest.exterminate(emptyList);
        //Then
        Assert.assertEquals(true,  newEmpty.isEmpty());
    }

    @After
    public void afterFirst(){
        System.out.println("Przypadek testowy - koniec: testOddNumbersExterminatorEmptyList()");
    }

    @Before
    public void beforeSecond(){
        System.out.println("Przypadek testowy - początek: testOddNumbersExterminatorNormalList()");
    }
    @Test
    public void testOddNumbersExterminatorNormalList () {
        //Given
        ArrayList<Integer> list = new ArrayList<Integer> ();
        list.add(15);
        list.add(60);
        list.add(87);
        list.add(1);
        list.add(43);
        list.add(13);
        list.add(22);
        list.add(6);
        list.add(78);
        list.add(9);
        list.add(10);
        list.add(31);

        //When
        OddNumbersExterminator exterminatorTest2 = new OddNumbersExterminator ();
        ArrayList<Integer> newNormal = exterminatorTest2.exterminate(list);

        //Then
        Assert.assertTrue(list.containsAll(newNormal));
    }
    @After
    public void afterSecond(){
        System.out.println("Przypadek testowy - koniec: testOddNumbersExterminatorNormalList()");
    }
}
