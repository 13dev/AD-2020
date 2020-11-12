package com.ad2020.aula6;

import com.ad2020.aula5.Point;

public abstract class Shape {
    private Point position;

    abstract double getArea();

    abstract double getPerimeter();

    Point getPosition() {
        return position;
    }

}
