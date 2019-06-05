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
            ArrayList<Shape> figures = new ArrayList<Shape>();
            ShapeCollector shapecollector = new ShapeCollector();
            Circle circle = new Circle(25.06);
            //When
            shapecollector.addFigure(circle);
            //Then
            Assert.assertEquals(1, figures.size());
        }
        @Test
        public void testRemoveFigure() {
            //Given
            ArrayList<Shape> figureTest = new ArrayList<Shape>();
            ShapeCollector shapecollector = new ShapeCollector();
            Circle circle = new Circle(25.06);
            figureTest.add(circle);
            //When
            boolean result = shapecollector.removeFigure(circle);
            //Then
            Assert.assertTrue(result);
        }
        @Test
        public void testGetFigure() {
            //Given
            ArrayList<Shape> figureTest = new ArrayList<Shape>();
            ShapeCollector shapecollector = new ShapeCollector();
            Circle circle = new Circle(25.06);
            figureTest.add(circle);
            Square square = new Square(14.02);
            figureTest.add(square);
            Triangle triangle = new Triangle(6.14, 12.78, 23.11);
            figureTest.add(triangle);
            //When
            Shape result = shapecollector.getFigure(1);
            //Then
            Assert.assertEquals(square, result);
        }
}

