package com.ad2020.aula1;

public class Aula1 {

    public void Helloworld() {
        System.out.println("Hello, World");
    }


    public void CalcularPerimetro(int width, int length) {
        int perimetro = 2 * (width + length);
        System.out.println("O perimetro é: " + perimetro);
    }

    public void CalcularVolume(int length, int width, int height) {
        int volume = width * length * height;
        System.out.println("O volume é: " + volume);
    }

    public void CalcularCelsius(int temp) {
        float celsius = (temp - 32) * 5 / 9;
        System.out.println(temp + " Fahrenheit - " + celsius + " celsius");
    }

    public static void Tempo(String t1, String t2) {
        String[] temp1 = t1.split(":");
        String[] temp2 = t2.split( ":");

        int[] time = new int[3];
        for (int i = 0; i < temp1.length; i++) {
            time[i] = Integer.parseInt(temp1[i]) - Integer.parseInt(temp2[i]);
        }

        System.out.println((time[0] * 60 * 60) + time[1] * 60 + time[2]);
    }
}