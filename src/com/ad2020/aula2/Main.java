package com.ad2020.aula2;
// Created by 13dev - 15/10/2020

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = {10, 20, 1, 30, 2, 10};

        int exercise1 = NumericalUtilities.powerOf(2, 10);
        System.out.println(exercise1);

        int exercise2 = NumericalUtilities.sumOfNaturalNumbersUpTo(3);
        System.out.println(exercise2);

        int exercise3 = NumericalUtilities.sumOfNaturalNumbersBetween(2, 5);
        System.out.println(exercise3);

        int exercise4 = NumericalUtilities.sumOfEvenNumbersBetween(1, 10);
        System.out.println(exercise4);

        int exercise5 = NumericalUtilities.numberOfDivisorsOf(10);
        System.out.println(exercise5);

        boolean exercise6 = NumericalUtilities.isPrime(1);
        System.out.println("primo - " + (exercise6 ? "sim" : "nao"));

        String exercise7 = ArrayUtilities.toString(nums);
        System.out.println(exercise7);

        int exercise8 = ArrayUtilities.maximumOf(nums);
        System.out.println(exercise8);

        int exercise9 = ArrayUtilities.minimumOf(nums);
        System.out.println(exercise9);

        int[] exercise10 = ArrayUtilities.copyOf(nums);
        System.out.println(Arrays.toString(exercise10));

        boolean exercise11 = ArrayUtilities.contains(nums, 20);
        System.out.println(exercise11);

        boolean exercise12 = ArrayUtilities.containsDuplicates(nums);
        System.out.println(exercise12);

        int exercise13 = ArrayUtilities.indexOf(nums, 2);
        System.out.println(exercise13);

        int[] exercise14 = ArrayUtilities.add(nums, 414);
        System.out.println(Arrays.toString(exercise14));

        int[] exercise15 = ArrayUtilities.remove(nums, 10);
        System.out.println(Arrays.toString(exercise15));
    }
}


