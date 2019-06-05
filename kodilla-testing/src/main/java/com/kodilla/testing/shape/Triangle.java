package com.kodilla.testing.shape;

class Triangle implements Shape {

    private final Double d;
    private final Double e;
    private final Double f;
    public Triangle (Double d, Double e, Double f) {
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public String getShapeName() {
        return "Triangle";
    }
    public double getField () {
        double triangleArea = (Math.sqrt((d + e + f)*(d + e - f)*(d - e + f)*(-d + e + f)))/4 ;
        return triangleArea;
    }
}
