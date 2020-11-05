package com.ad2020.aula5;

public class Main {
    public static void main(String[] args) {
//        Calculator c = new Calculator();
//        c.add(1);


        Point p1 = new Point(1,2);
        Point p2 = new Point(2,3);
        Point p3 = new Point(4,5);

        Point p4 = new Point(6,7);

        Point p5 = new Point(2,3);

        System.out.println(p1.getX());
        System.out.println(p1.getY());

        Triangle t = new Triangle(p1, p2, p3);
        System.out.println(t.calcHeight());
        System.out.println(t.calcBase());

        Retangle r = new Retangle(p1, 10, 20);

        System.out.println(r.calcArea());
        System.out.println(r.calcPerimeter());
        System.out.println(r.contains(new Point(1.1, 1.2)));

    }
}
