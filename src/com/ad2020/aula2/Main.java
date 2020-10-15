package com.ad2020.aula2;
// Created by 13dev - 15/10/2020

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = {10, 20, 1, 30, 2, 10};

        //exercise1
        int exercise1 = NumericalUtilities.powerOf(2, 10);
        System.out.println(exercise1);

        //exercise2
        int exercise2 = NumericalUtilities.sumOfNaturalNumbersUpTo(3);
        System.out.println(exercise2);

        //exercise3
        int exercise3 = NumericalUtilities.sumOfNaturalNumbersBetween(2, 5);
        System.out.println(exercise3);

        //exercise4
        int exercise4 = NumericalUtilities.sumOfEvenNumbersBetween(1, 10);
        System.out.println(exercise4);

        //exercise5
        int exercise5 = NumericalUtilities.numberOfDivisorsOf(10);
        System.out.println(exercise5);

        //exercise6
        boolean exercise6 = NumericalUtilities.isPrime(4);
        System.out.println("primo - " + (exercise6 ? "sim" : "nao"));

        //exercise7
        String exercise7 = ArrayUtilities.toString(nums);
        System.out.println(exercise7);

        //exercise8
        int exercise8 = ArrayUtilities.maximumOf(nums);
        System.out.println(exercise8);

        //exercise9
        int exercise9 = ArrayUtilities.minimumOf(nums);
        System.out.println(exercise9);

        //exercise10
        int[] exercise10 = ArrayUtilities.copyOf(nums);
        System.out.println(Arrays.toString(exercise10));

        //exercise11
        boolean exercise11 = ArrayUtilities.contains(nums, 20);
        System.out.println(exercise11);

        //exercise12
        boolean exercise12 = ArrayUtilities.containsDuplicates(nums);
        System.out.println(exercise12);

        //exercise13
        int exercise13 = ArrayUtilities.indexOf(nums, 2);
        System.out.println(exercise13);

        //exercise14
        int[] exercise14 = ArrayUtilities.add(nums, 414);
        System.out.println(Arrays.toString(exercise14));

        //exercise15
        int[] exercise15 = ArrayUtilities.remove(nums, 10);
        System.out.println(Arrays.toString(exercise15));
    }
}


