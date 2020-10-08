package com.ad2020.aula1;

public class Aula1 {

    private int[] nums = {1, 2, 3, 4, 5};

    public static int MAX_INT = 2147483647;

    public void helloWorld() {
        System.out.println("Hello, World");
    }


    public void calcPerimetro(int width, int length) {
        int perimetro = 2 * (width + length);
        System.out.println("O perimetro é: " + perimetro);
    }

    public void calcVolume(int length, int width, int height) {
        int volume = width * length * height;
        System.out.println("O volume é: " + volume);
    }

    public void calcCelcius(int temp) {
        System.out.println(temp + " Fahrenheit - " + (temp - 32) * 5 / 9 + " celsius");
    }

    public static void time(String time1, String time2) {
        String[] temp1 = time1.split(":");
        String[] temp2 = time2.split(":");

        int[] time = new int[3];
        for (int i = 0; i < temp1.length; i++) {
            time[i] = Integer.parseInt(temp1[i]) - Integer.parseInt(temp2[i]);
        }

        System.out.println((time[0] * 60 * 60) + time[1] * 60 + time[2]);
    }

    public int maxNums() {
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }

    public int minNums() {
        int min = MAX_INT;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        return min;
    }

    public int mediumNums()
    {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return sum / nums.length;
    }


}