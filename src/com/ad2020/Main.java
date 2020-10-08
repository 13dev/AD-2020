package com.ad2020;

import com.ad2020.aula1.Aula1;

public class Main {

    public static void aula1() {
        Aula1 aula1 = new Aula1();
        aula1.helloWorld();
        aula1.calcPerimetro(5, 3);
        aula1.calcVolume(2, 3, 5);
        aula1.calcCelcius(96);
        Aula1.time("43:01:0", "41:0:0");
        System.out.println(aula1.maxNums());
        System.out.println(aula1.minNums());
        System.out.println(aula1.mediumNums());
    }

    public static void main(String[] args) {
        aula1();
    }


}
