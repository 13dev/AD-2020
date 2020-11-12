package com.ad2020.aula6;

import java.util.ArrayList;

public class Figure {
    ArrayList<Shape> shapes;

    public Figure(){
        shapes = new ArrayList<>();
    }

    public Figure(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "shapes=" + shapes +
                '}';
    }
}
