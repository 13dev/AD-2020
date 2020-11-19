package com.ad2020.aula7.comparators;

import com.ad2020.aula7.Student;

import java.util.Comparator;

public class StudentsComparatorByName implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {

        return student1.getName().compareTo(
                student2.getName()
        );
    }
}
