package com.ad2020.aula6;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super(null);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    double getPerimeter() {
        return (2 * Math.PI) * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }
}
