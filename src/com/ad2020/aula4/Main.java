package com.ad2020.aula4;
// Created by 13dev - 29/10/2020

import java.util.Arrays;

public class Main {

    private static void problem() {
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

        int[][] matrizIntenty = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        System.out.println(MatrixUtilities.show(matriz1));

        System.out.println(MatrixUtilities.isMatrix(matriz2));
        System.out.println(MatrixUtilities.isIdentity(matrizIntenty));
        int[][] matrix3 = MatrixUtilities.multiplyBy(matriz2, 2);

        System.out.println(MatrixUtilities.show(matrix3));


        System.out.println(MatrixUtilities.areCompatibleForSum(matriz1, matriz2));
        System.out.println(Arrays.deepToString(MatrixUtilities.sumOf(matriz1, matriz2)));

        CharacterDrawingUtilities.drawElement('+');
        CharacterDrawingUtilities.drawNewLine();
        CharacterDrawingUtilities.drawHorizontalSegmentWith('a');
        System.out.println();
        CharacterDrawingUtilities.drawFilledRectangelWith(10, 10, '+');
        CharacterDrawingUtilities.drawEmptyRectangleWith(10, 10, '+');
    }
}