package com.ad2020.aula4;
// Created by 13dev - 29/10/2020

public class MatrixUtilities {
    public static void show(int[][] data) {
        for (int[] datum : data) {
            System.out.print("[ ");
            for (int j = 0; j < data.length; j++) {
                System.out.print(datum[j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public static boolean isMatrix(int[][] verificar) {
        int numCol = verificar.length;
        int lastIndex = 0;
        for (int i = 1; i < verificar.length; i++) {
            if (verificar[i].length != verificar[i - 1].length) {
                return false;
            }

            lastIndex = i;
        }

        return numCol == verificar[lastIndex].length;
    }

    public static boolean isIdentity(int[][] verificar) {
        int count = 0;
        int contInvalids = 0;
        for (int i = 0; i < verificar.length; i++) {
            for (int x = 0; x < verificar[i].length; x++) {
                if (x == i) {
                    if (verificar[i][x] == 1) {
                        count += 1;
                    }
                } else {
                    if (verificar[i][x] != 0) {
                        contInvalids += 1;
                    }
                }
            }
        }
        if (contInvalids != 0) {
            return false;
        }

        return count == verificar.length || count == verificar[0].length;
    }

    public static int[][] multiplyBy(int[][] valores, int mult) {
        int[][] result = new int[valores.length][valores[0].length];
        for (int i = 0; i < valores.length; i++) {
            for (int x = 0; x < valores[i].length; x++) {
                result[i][x] = valores[i][x] * mult;
            }
        }
        return result;
    }

    public static int getLineLength(int[][] verify) {
        int count = 0;
        int temp = 0;
        for (int[] ints : verify) {
            if (count > temp) {
                temp = count;
            }
            count = 0;
            for (int x = 0; x < ints.length; x++) {
                count++;
            }
        }
        return count;
    }

    public static boolean areCompatibleForSum(int[][] dataOne, int[][] dataTwo) {
        return getLineLength(dataOne) == getLineLength(dataTwo)
                && dataOne.length == dataTwo.length;
    }

    public static int[][] sumOf(int[][] dataOne, int[][] dataTwo) {

        int[][] result = new int[dataOne.length][dataOne[0].length];

        if (areCompatibleForSum(dataOne, dataTwo)) {
            for (int i = 0; i < dataOne.length; i++) {
                for (int x = 0; x < dataOne.length; x++) {
                    result[i][x] = dataOne[i][x] + dataTwo[i][x];
                }
            }
        }

        return result;
    }
}
