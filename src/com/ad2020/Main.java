package com.ad2020;

import com.ad2020.aula1.Aula1;

public class Main {

    public static void aula1() {
        Aula1 aula1 = new Aula1();
        aula1.helloWorld();
        aula1.getPerimeter(5, 3);
        aula1.getVolume(2, 3, 5);
        aula1.getCelcius(96);
        Aula1.time("43:01:0", "41:0:0");
        System.out.println(aula1.getMaxNums());
        System.out.println(aula1.getMinNums());
        System.out.println(aula1.getMediumNums());
    }

    public static void main(String[] args) {
        aula1();
    }


}
