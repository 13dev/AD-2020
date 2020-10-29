package com.ad2020.aula4;

public class Main {
    public static void main(String[] args) {
        final int[] studentNumbers = {20032, 30312, 25342, 31432};
        final String[] courseAcronyms = {"AD", "WEB-FE", "WEB-BE"};
        final int[][] studentGrades = {
                {15, 18, 17},
                {18, 10, 15},
                {11, 13, 15},
                {10, 19, 16}
        };

        Problem.printGrades(studentNumbers, courseAcronyms, studentGrades);
    }
}
