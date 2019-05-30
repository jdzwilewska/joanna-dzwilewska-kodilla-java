package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    //Zestaw testów dla figur geometrycznych
        private static int testCounter = 0;

        @BeforeClass
        public static void beforeAllTests() {
            System.out.println("Rozpoczęcie testów.");
        }

        @AfterClass
        public static void afterAllTests() {
            System.out.println("Zakończenie wszystkich testów");
        }

        @Before
        public void beforeEveryTest() {
            testCounter++;
            System.out.println("Przygotowanie do rozpoczęcia testu nr: " + testCounter);
        }
        @Test
        public void testAddFigure() {
            //Given
            Shape circle = new Circle();
            ShapeCollector shapecollector = new ShapeCollector(circle);
            //When
            shapecollector.addFigure();
            //Then
            ArrayList<Shape> shapes = new ArrayList<Shape>();
            Assert.assertEquals(1, shapes.size());
        }
        @Test
        public void testRemoveFigure() {
            //Given
            Shape circle = new Circle();
            ShapeCollector shapecollector = new ShapeCollector(circle);
            //When
            boolean result = shapecollector.removeFigure(circle);
            //Then
            ArrayList<Shape> shapes = new ArrayList<Shape>();
            Assert.assertTrue(result);
        }
        @Test
        public void TestGetFigure() {

    }



}
