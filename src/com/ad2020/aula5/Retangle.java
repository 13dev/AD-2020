package com.ad2020.aula5;

public class Retangle {

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

    public double calcArea() {
        return Math.round(height * width);
    }

    public double calcPerimeter() {
        return Math.round((width + height) * 2);
    }

    public boolean contains(Point point) {
//            Point p1 = topLeftPoint;
//            Point p2 = new Point(topLeftPoint.getX() + width, topLeftPoint.getY());
//            Point p3 = new Point(height - topLeftPoint.getX(), height - topLeftPoint.getY());
//            Point p4 = new Point(p2.getX(), p3.getY());

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
}
