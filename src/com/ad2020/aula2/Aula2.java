package com.ad2020.aula2;
// Created by 13dev - 09/10/2020

public class Aula2 {

    public static int powerOf(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    //2
    public static int sumNaturalNumsUpTo(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }

    //3
    public static int sumNaturalNumsBetween(int n1, int n2) {
        int result = 0;
        for (int i = n1; i <= n2; i++) {
            result += i;

        }
        return result;
    }

    //4
    public static int sumEvenNumsBetween(int n1, int n2) {
        int result = 0;
        for (int i = n1; i <= n2; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        return result;
    }

    //5
    public static int numOfDivisorsOf(int n1) {
        int result = 0;
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0) {
                result++;
            }
        }
        return result;
    }

    //6
    public static void isPrime(int n1) {
        int result = 0;
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0) {
                result++;
            }
        }
        if (result == 2) {
            System.out.println("Numero é primo");
        } else {
            System.out.println("Number não é primo");
        }
    }

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
