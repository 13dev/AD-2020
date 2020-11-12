package com.ad2020.aula6;

import com.ad2020.aula5.Point;

import java.util.ArrayList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
//        Supervisor supervisor = new Supervisor("Pedro", "123456789", 3);
//        Employee employee = new Supervisor("Ana", "98765", 5);

        Car car = new Car(2001, "Tesla", "Model X", 19.99, "green");
        Motorcycle motorcycle = new Motorcycle(2001, "Tesla", "Model Moto", 29.99, "blue");
        Circle circle = new Circle(20);

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Retangle(new Point(1,2), 10,  20));
        shapes.add(new Triangle(new Point(1,2), new Point(2,3), new Point(4,5)));

        Figure figure = new Figure(shapes);

        System.out.println(car);
        System.out.println(motorcycle);
        System.out.println(circle);
        System.out.println(figure);
    }
}
