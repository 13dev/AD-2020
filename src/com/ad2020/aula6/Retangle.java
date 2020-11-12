package com.ad2020.aula6;

import com.ad2020.aula5.Point;

public class Retangle extends Shape {

    public Point topLeftPoint;

    public double height;
    public double width;

    public Retangle(Point topLeftPoint, double height, double width) {
        this.topLeftPoint = topLeftPoint;
        this.height = height;
        this.width = width;
    }

    public Retangle() {
        this.topLeftPoint = null;
        this.height = 0;
        this.width = 0;
    }

    public Point getTopLeftPoint() {
        return topLeftPoint;
    }

    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public boolean contains(Point point) {
        double point1 = topLeftPoint.getX() + width;
        double point2 = topLeftPoint.getY() - height;

        if (point.getX() > point1 || point.getX() < topLeftPoint.getX()) {
            return false;
        }

        if (point.getY() > topLeftPoint.getY() || point.getY() < point2) {
            return false;
        }

        return true;


    }

    @Override
    double getArea() {
        return Math.round(height * width);
    }

    @Override
    double getPerimeter() {
        return Math.round((width + height) * 2);
    }
}
