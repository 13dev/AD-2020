package com.ad2020.aula2;
// Created by 13dev - 15/10/2020

public class NumericalUtilities {

    //1
    public static int powerOf(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    //2
    public static int sumOfNaturalNumbersUpTo(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }

    //3
    public static int sumOfNaturalNumbersBetween(int n1, int n2) {
        int result = 0;
        for (int i = n1; i <= n2; i++) {
            result += i;

        }
        return result;
    }

    //4
    public static int sumOfEvenNumbersBetween (int n1, int n2) {
        int result = 0;
        for (int i = n1; i <= n2; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        return result;
    }

    //5
    public static int numberOfDivisorsOf(int n1) {
        int result = 0;
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0) {
                result++;
            }
        }
        return result;
    }

    //6
    // primo 2 divisores por 1 e si propio
    public static boolean isPrime(int num) {
        // num factores
        int nums = 0;

        for(int i = 1; i <= num; i++){
            if(num % i == 0) nums++;
        }

        return nums == 2;

    }

}
