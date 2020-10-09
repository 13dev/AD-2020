package com.ad2020.aula2;
// Created by 13dev - 09/10/2020

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = {10, 20, 1, 30, 2, 10};

        //exercise1
        int exercise1 = Aula2.powerOf(2, 10);
        System.out.println(exercise1);

        //exercise2
        int exercise2 = Aula2.sumNaturalNumsUpTo(3);
        System.out.println(exercise2);

        //exercise3
        int exercise3 = Aula2.sumNaturalNumsBetween(2, 5);
        System.out.println(exercise3);

        //exercise4
        int exercise4 = Aula2.sumEvenNumsBetween(1, 10);
        System.out.println(exercise4);

        //exercise5
        int exercise5 = Aula2.numOfDivisorsOf(10);
        System.out.println(exercise5);

        //exercise6
        boolean exercise6 = Aula2.isPrime(4);
        System.out.println("primo - " + (exercise6 ? "sim" : "nao"));

        //exercise7
        String exercise7 = Aula2.toString(nums);
        System.out.println(exercise7);

        //exercise8
        int exercise8 = Aula2.maximumOf(nums);
        System.out.println(exercise8);

        //exercise9
        int exercise9 = Aula2.minimumOf(nums);
        System.out.println(exercise9);

        //exercise10
        int[] exercise10 = Aula2.copyOf(nums);
        System.out.println(Arrays.toString(exercise10));

        //exercise11
        boolean exercise11 = Aula2.contains(nums, 20);
        System.out.println(exercise11);

        //exercise12
        boolean exercise12 = Aula2.containsDuplicates(nums);
        System.out.println(exercise12);

        //exercise13
        int exercise13 = Aula2.indexOf(nums, 2);
        System.out.println(exercise13);

        //exercise14
        int[] exercise14 = Aula2.add(nums, 414);
        System.out.println(Arrays.toString(exercise14));

        //exercise15
        int[] exercise15 = Aula2.remove(nums, 10);
        System.out.println(Arrays.toString(exercise15));
    }
}


