package com.ad2020.aula4;
// Created by 13dev - 29/10/2020

public class CharacterDrawingUtilities {
    public static void drawElement(char letter) {
        System.out.print(letter);
    }

    public static void drawNewLine() {
        System.out.println();
    }

    public static void drawHorizontalSegmentWith(char letter) {
        for (int i = 0; i < 10; i++) {
            drawElement(letter);
        }
    }

    public static void drawFilledRectangelWith(int height, int width, char letter) {
        for (int i = 0; i < height; i++) {
            if (i != 0) {
                drawNewLine();
            }
            for (int x = 0; x < width; x++) {
                drawElement(letter);
            }
        }
        drawNewLine();
    }

    public static void drawEmptyRectangleWith(int height, int width, char letter) {
        for (int i = 0; i < height; i++) {
            if (i != 0) {
                drawNewLine();
            }

            for (int x = 0; x < width; x++) {
                if (i == 0 || i == (height - 1)) {
                    drawElement(letter);
                } else if (x == 0 || x == width - 1) {
                    drawElement(letter);
                } else {
                    drawElement(' ');
                }
            }
        }
        drawNewLine();
    }
}
