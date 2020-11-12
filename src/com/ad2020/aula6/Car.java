package com.ad2020.aula6;

public class Car extends Vehicle {
    public Car() {
        super();
    }

    public Car(int year, String brand, String model, double price, String color) {
        super(year, brand, model, price, color);
    }

    @Override
    public String toString() {
        return "Car{} " + super.toString();
    }
}
