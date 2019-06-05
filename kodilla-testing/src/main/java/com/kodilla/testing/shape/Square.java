package com.kodilla.testing.shape;

class Square implements Shape {

    private final Double a;
    public Square(Double a) {
        this.a = a;
    }

    public String getShapeName() {
        return "Square";
    }
    public double getField () {
        double squareArea = a*a;
        return squareArea;
    }
}
