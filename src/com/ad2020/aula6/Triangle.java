package com.ad2020.aula6;

import com.ad2020.aula5.Point;

public class Triangle extends Shape {

    public Point a;
    public Point b;
    public Point c;

    public Triangle(Point a, Point b, Point c) {
        super(a);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
        super(null);
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public void setABC(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public double calcBase() {
        return Math.round(a.distance(b));
    }

    public double calcHeight() {
        return Math.round(a.distance(c));
    }

    @Override
     double getArea() {
        return Math.round((calcBase() * calcHeight()) / 2);
    }

    @Override
    double getPerimeter() {
        return a.distance(b) + b.distance(c) + c.distance(a);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                "} " + super.toString();
    }
}
