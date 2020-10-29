package com.ad2020.aula4;
// Created by 13dev - 29/10/2020

public class MatrixUtilities {
    public static String show(int[][] data) {
        StringBuilder buffer = new StringBuilder();
        for (int[] datum : data) {
            buffer.append("[ ");
            for (int j = 0; j < data.length; j++) {
                buffer.append(datum[j]).append(" ");
            }
            buffer.append("]");
            buffer.append("\n");
        }

        return buffer.toString();
    }

    public static boolean isMatrix(int[][] matrix) {
        int numCol = matrix.length;
        int lastIndex = 0;
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i].length != matrix[i - 1].length) {
                return false;
            }

            lastIndex = i;
        }

        return numCol == matrix[lastIndex].length;
    }

    public static boolean isIdentity(int[][] matrix) {
        if (matrix.length != matrix[0].length) {
            return false;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int x = 0; x < matrix[i].length; x++) {
                if (i == x && matrix[i][x] != 1) {
                    return false;
                }
                if (i != x && matrix[i][x] != 0) {
                   return false;
                }

            }
        }

        return true;
    }

    public static int[][] multiplyBy(int[][] matrix, int multiplyBy) {
        int[][] result = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int x = 0; x < matrix[i].length; x++) {
                result[i][x] = matrix[i][x] * multiplyBy;
            }
        }

        return result;
    }

    public static boolean areCompatibleForSum(int[][] matrixOne, int[][] matrixTwo) {
        return isMatrix(matrixOne) && isMatrix(matrixTwo);
    }

    public static int[][] sumOf(int[][] matrixOne, int[][] matrixTwo) {

        int[][] result = new int[matrixOne.length][matrixOne[0].length];

        if (areCompatibleForSum(matrixOne, matrixTwo)) {
            for (int i = 0; i < matrixOne.length; i++) {
                for (int x = 0; x < matrixOne.length; x++) {
                    result[i][x] = matrixOne[i][x] + matrixTwo[i][x];
                }
            }
        }

        return result;
    }
}
