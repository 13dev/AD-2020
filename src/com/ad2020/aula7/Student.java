package com.ad2020.aula7;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private final int number;
    private final String name;

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return number == student.number && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }

    @Override
    public int compareTo(Student o) {
        return this.number - o.number;
    }


    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
