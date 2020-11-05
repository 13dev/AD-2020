package com.ad2020.aula5;

public class Calculator {

    private double value;

    public Calculator() {
        value = 0.0;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void clear() {
        value = 0.0;
    }

    public void add(double term) {
        value += term;
    }
}
