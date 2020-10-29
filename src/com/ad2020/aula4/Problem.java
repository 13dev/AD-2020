package com.ad2020.aula4;

public class Problem {
    public static void printGrades(int[] numbers, String[] acronyms, int[][] grades) {
        float media = 0;
        float soma = 0;
        float maisAlta = 0;
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            soma = 0;
            System.out.println("As notas " + numbers[i] + " sao: ");
            for (int x = 0; x < grades[x].length; x++) {
                soma += grades[i][x];
                System.out.println(acronyms[x] + ": " + grades[i][x]);
            }

            media = soma / grades[i].length;
            if (media > maisAlta) {
                maisAlta = media;
                index = i;
            }

            System.out.println("Média: " + Math.round(media * 100.0) / 100.0);
            System.out.println(" ");
        }
        System.out.println("Media mais alta foi: " + maisAlta + " do aluno: " + numbers[index]);
    }
}
