package com.ad2020.aula6.ex01;

public class Supervisor extends Employee {
    private final int level;

    public Supervisor(String name, String ssn, int level) {
        super(name, ssn);
        this.level = level;
    }


    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Supervisor{" +
                "level=" + level +
                "} " + super.toString();
    }
}
