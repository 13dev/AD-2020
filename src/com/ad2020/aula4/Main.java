package com.ad2020.aula4;
// Created by 13dev - 29/10/2020

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
        int[][] matrixOne = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        int[][] matrixTwo = {
                {1, 1, 2},
                {5, 1, 3},
                {1, 3, 3, 5}
        };

        System.out.println(MatrixUtilities.show(matrixOne));

        System.out.println(MatrixUtilities.isMatrix(matrixTwo));
        System.out.println(MatrixUtilities.isIdentity(matrixOne));
        int[][] matrix3 = MatrixUtilities.multiplyBy(matrixTwo, 2);

        System.out.println(MatrixUtilities.show(matrix3));


        System.out.println(MatrixUtilities.areCompatibleForSum(matrixOne, matrixTwo));
        System.out.println(MatrixUtilities.show(MatrixUtilities.sumOf(matrixOne, matrixTwo)));

        CharacterDrawingUtilities.drawElement('+');
        CharacterDrawingUtilities.drawNewLine();
        CharacterDrawingUtilities.drawHorizontalSegmentWith('a');
        System.out.println();
        System.out.println();
        CharacterDrawingUtilities.drawFilledRectangelWith(10, 10, '+');
        System.out.println();
        CharacterDrawingUtilities.drawEmptyRectangleWith(10, 10, '+');
    }
}