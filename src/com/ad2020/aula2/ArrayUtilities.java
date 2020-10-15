package com.ad2020.aula2;
// Created by 13dev - 15/10/2020

public class ArrayUtilities {

    public static String toString(int[] data) {
        StringBuilder result = new StringBuilder();

        for (int numero : data) {
            result.append(numero).append(", ");
        }

        return result.substring(0, result.length() - 2);
    }


    public static int maximumOf(int[] data) {
        int max = data[0];
        for (int num : data) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }


    public static int minimumOf(int[] data) {
        int min = data[0];

        for (int num : data) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }


    public static int[] copyOf(int[] data) {
        int[] copy = new int[data.length];

        System.arraycopy(data, 0, copy, 0, data.length);

        return copy;
    }


    public static boolean contains(int[] data, int n) {
        for (int numero : data) {
            if (numero == n) {
                return true;
            }
        }
        return false;
    }


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


    public static int indexOf(int[] data, int n) {
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if (n == data[i]) {
                index = i;
                break;
            }

            index = -1;
        }
        return index;
    }


    public static int[] add(int[] data, int n) {
        int[] novo = new int[data.length + 1];

        System.arraycopy(data, 0, novo, 0, data.length);
        novo[data.length] = n;

        return novo;
    }

    public static int[] remove(int[] data, int n) {

        int[] newNum = new int[data.length - 1];

        for (int i = 0; i < newNum.length; i++) {
            if(data[i] == n) {
                continue;
            }

            newNum[i] = data[i];
        }
        return newNum;

    }
}
