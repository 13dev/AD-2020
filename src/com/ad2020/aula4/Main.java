package com.ad2020.aula4;
// Created by 13dev - 29/10/2020

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matriz1 = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        int[][] matriz2 = {
                {1, 1, 2},
                {5, 1, 3},
                {1, 3, 3}
        };
        MatrixUtilities.show(matriz1);
        System.out.println(MatrixUtilities.isMatrix(matriz2));
        System.out.println(MatrixUtilities.isIdentity(matriz1));
        MatrixUtilities.multiplyBy(matriz1, 2);

        System.out.println(MatrixUtilities.areCompatibleForSum(matriz1, matriz2));
        System.out.println(Arrays.deepToString(MatrixUtilities.sumOf(matriz1, matriz2)));

        CharacterDrawingUtilities.drawElement('+');
        CharacterDrawingUtilities.drawNewLine();
        CharacterDrawingUtilities.drawHorizontalSegmentWith('a');
        CharacterDrawingUtilities.drawFilledRectangelWith(10, 10, '+');
        CharacterDrawingUtilities.drawEmptyRectangleWith(10, 10, '+');

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
