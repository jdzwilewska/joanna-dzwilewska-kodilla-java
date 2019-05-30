package com.kodilla.testing.shape;

import java.util.*;
import java.lang.*;
import java.io.*;

public interface Shape {
    void getShapeName(String name);
    void getField (float area);
}

class Square implements Shape {
    public void getShapeName(String name) {
    }
    public void getField (float area) {
    }
}

class Triangle implements Shape {
    public void getShapeName(String name) {
    }
    public void getField (float area) {
    }

}
class Circle implements Shape {
    public void getShapeName(String name) {
    }
    public void getField (float area) {
    }
}

class ShapeCollector {

    private Shape shape;

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public void addFigure() {
    }
    public boolean removeFigure(Shape shape) {
        return true;
    }
    public Shape getFigure (int n) {
        return null;
    }
    public void showFigure () {
    }

}

class Application {
    public static void main (String[] args) throws java.lang.Exception {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        System.out.println(shapes.size());
    }
}
