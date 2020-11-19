package com.ad2020.aula7;

import java.util.Objects;

public class Course {

    private int code;
    private String name;
    private int etcs;
    private int ano;

    public Course(int code, String name, int etcs, int ano) {
        this.code = code;
        this.name = name;
        this.etcs = etcs;
        this.ano = ano;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        return code == course.code &&
                etcs == course.etcs &&
                ano == course.ano &&
               name.equals(course.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, etcs, ano);
    }

    public int getCode() {
        return code;
    }

    public int getAno() {
        return ano;
    }
}
