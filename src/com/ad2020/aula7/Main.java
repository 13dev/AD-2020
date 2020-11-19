package com.ad2020.aula7;

import com.ad2020.aula7.comparators.StudentsComparatorByName;
import com.ad2020.aula7.comparators.StudentsComparatorByNumber;
import com.ad2020.aula7.game.Menu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        for (Menu option : Menu.values()) {
            System.out.println(option);
        }

        Menu option = Menu.LOADGAME;

        //        if(option == Menu.QUIT) {
        //            System.out.println("Quit game");
        //        } else if(option == Menu.HIGHSCORES) {
        //            System.out.println("High scores");
        //        } else if(option == Menu.LOADGAME) {
        //            System.out.println("Load game");
        //        } else if(option == Menu.SAVEGAME) {
        //            System.out.println("Save game");
        //        } else {
        //            // save game
        //            System.out.println("Save game");
        //        }

        switch (option) {
            case QUIT -> System.out.println("Quit");
            case SAVEGAME -> System.out.println("SAVEGAME");
            case LOADGAME -> System.out.println("LOADGAME");
            case START -> System.out.println("START");
            case HIGHSCORES -> System.out.println("HIGHSCORES");
            default -> System.out.println("Default");
        }

        rationals();
        students();
        maps();

    }

    private static void rationals() {
        ArrayList<Rational> rationals = new ArrayList<>();
        rationals.add(new Rational(1, 2));
        rationals.add(new Rational(2, 2));
        rationals.add(new Rational(3, 4));
        rationals.add(new Rational(4, 5));
        rationals.add(new Rational(5, 6));

        Collections.sort(rationals);
    }

    private static void students() {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(2019019, "leo Oliveira"));
        students.add(new Student(2019018, "Bruno"));

        Collections.sort(students);

        students.sort(new StudentsComparatorByName());
        students.sort(new StudentsComparatorByNumber());
    }

    private static void maps() {

        Map<Integer, Course> coursesMap = new HashMap<>();
        HashMap<Integer, ArrayList<Course>> coursesByYear = new HashMap<>();


        Course course1 = new Course(2019019, "Matematica", 60, 2020);
        Course course2 = new Course(2019018, "Portugues", 61, 2021);
        Course course3 = new Course(2019017, "Historia", 61, 2020);

        coursesMap.put(course1.getCode(), course1);
        coursesMap.put(course2.getCode(), course2);
        coursesMap.put(course3.getCode(), course3);

        System.out.println(coursesMap.containsKey(2019019));

        coursesMap.forEach((code, course) -> {
            System.out.println("Codigo disiciplina: " + code);
            System.out.println("Values disiciplina: " + course.getClass());
            System.out.println("Key, Value " + code + course);
        });


        coursesMap.forEach((code, course) -> {
            if(coursesByYear.containsKey(course.getAno())) {
                coursesByYear.get(course.getAno()).add(course);
                return;
            }

            ArrayList<Course> coursesByYearList = new ArrayList<>();
            coursesByYearList.add(course);

            coursesByYear.put(course.getAno(), coursesByYearList);

        });



        System.out.printf("");
    }

}
