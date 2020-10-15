package com.ad2020.aula2;
// Created by 13dev - 15/10/2020

public class ArrayUtilities {

    //7
    public static String toString(int[] data) {
        StringBuilder result = new StringBuilder();

        for (int numero : data) {
            result.append(numero).append(",");
        }

        return result.toString();
    }

    //8
    public static int maximumOf(int[] data) {
        int max = data[0];
        for (int num : data) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    //9
    public static int minimumOf(int[] data) {
        int min = data[0];

        for (int num : data) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    //10
    public static int[] copyOf(int[] data) {
        int[] copy = new int[data.length];

        System.arraycopy(data, 0, copy, 0, data.length);

        return copy;
    }

    //11
    public static boolean contains(int[] data, int n) {
        for (int numero : data) {
            if (numero == n) {
                return true;
            }
        }
        return false;
    }

    //12
    public static boolean containsDuplicates(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] == data[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    //13
    public static int indexOf(int[] data, int n) {
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if (n == data[i]) {
                index = i;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }

    //14
    public static int[] add(int[] data, int n) {
        int[] novo = new int[data.length + 1];

        System.arraycopy(data, 0, novo, 0, data.length);
        novo[data.length] = n;

        return novo;
    }

    //15
    public static int[] remove(int[] data, int n) {
        int quant = 0;
        int pos = 0;
        for (int num : data) {
            if (num == n) {
                quant++;
            }
        }

        int[] newNum = new int[data.length - quant];

        for (int num : data) {
            if (num != n) {
                newNum[pos++] = num;
            }
        }

        return newNum;
    }
}
