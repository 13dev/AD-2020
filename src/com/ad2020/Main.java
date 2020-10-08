package com.ad2020;

import com.ad2020.aula1.Aula1;

public class Main {


    public static void main(String[] args) {
        aula1();
    }

    public static void aula1() {
        Aula1 aula1 = new Aula1();
        aula1.Helloworld();
        aula1.CalcularPerimetro(5, 3);
        aula1.CalcularVolume(2, 3, 5);
        aula1.CalcularCelsius(96);
        Aula1.Tempo("42:03:2", "41:0:0");
    }
}
