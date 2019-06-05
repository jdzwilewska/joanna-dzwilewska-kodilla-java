package com.kodilla.testing.shape;

class Circle implements Shape {
    private final Double r;

    public Circle(Double r) {
        this.r = r;
    }

    public String getShapeName()
    {
        return "Circle";
    }
    public double getField () {
        double circleArea = Math.PI * r * r;
        return circleArea;
    }
}
