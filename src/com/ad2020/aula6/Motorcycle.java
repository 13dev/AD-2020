package com.ad2020.aula6;

public class Motorcycle extends Vehicle {

    public Motorcycle() {
    }

    public Motorcycle(int year, String brand, String model, double price, String color) {
        super(year, brand, model, price, color);
    }

    @Override
    public String toString() {
        return "Motorcycle{} " + super.toString();
    }
}
