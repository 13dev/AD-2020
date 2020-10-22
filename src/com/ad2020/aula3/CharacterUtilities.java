package com.ad2020.aula3;

import java.util.Arrays;

public class CharacterUtilities {

    public static char lowerLetterSuccessorOf(char letter) {

        if (letter == 'z') {
            return 'a';
        }

        return ++letter;
    }

    public static char lowerLetterPredecessorOf(char letter) {

        if (letter == 'a') {
            return 'z';
        }

        return --letter;
    }

    public static char lowerLetterSuccessorStepsOf(char letter, int step) {
        char result = letter;

        for (int i = 0; i < step; i++) {
            result += lowerLetterSuccessorOf(letter);
        }

        return result;
    }

    public static char lowerLetterPredecessorStepsOf(char letter, int step) {

        char result = letter;

        for (int i = step; i < 0; i++) {
            result += lowerLetterPredecessorOf(letter);
        }

        return result;

    }

    public static int occurrencesOfCharacterIn(char[] letras, char letra) {
        int duplicates = 0;
        for (char c : letras) {
            if (c == letra) {
                duplicates++;
            }
        }
        return duplicates;
    }

    public static char[] replaceCharacterIn(char[] charArray, char charOld, char charNew) {
        char[] result = new char[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            result[i] = charArray[i];

            if (result[i] == charOld) {
                result[i] = charNew;
            }
        }
        return charArray;
    }

    public static char[] concatenationOf(char[] charOne, char[] charTwo) {
        char[] result = new char[charOne.length + charTwo.length];

        for (int i = 0; i < charOne.length + charTwo.length; i++) {
            if(i < charOne.length) {
                result[i] = charOne[i];
                continue;
            }

            result[i] = charTwo[i - charOne.length];
        }

        return result;
    }

    public static char[] copyOfPartOf(char[] letters, int begin, int end) {
        if(end > begin) {
            return letters;
        }

        return Arrays.copyOfRange(letters, begin, end);
    }

    public static String cipher(String letras, int num) {
        StringBuilder cipher = new StringBuilder();

        for (int i = 0; i < letras.length(); i++) {
            cipher.append(lowerLetterSuccessorStepsOf(letras.charAt(i), num));
        }

        return cipher.toString();
    }

    public static String decipher(String letras, int num) {
       StringBuilder decipher = new StringBuilder();

        for (int i = 0; i < letras.length(); i++) {
            decipher.append(lowerLetterPredecessorStepsOf(letras.charAt(i), num));
        }

        return decipher.toString();
    }
}
