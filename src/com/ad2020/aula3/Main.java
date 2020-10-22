package com.ad2020.aula3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char letter = 'f';
        int numero = 5;

        char nextLetter = CharacterUtilities.lowerLetterSuccessorOf(letter);
        System.out.println(nextLetter);

        char previousLetter = CharacterUtilities.lowerLetterPredecessorOf(letter);
        System.out.println(previousLetter);

        char nextsteps = CharacterUtilities.lowerLetterSuccessorStepsOf(letter, numero);
        System.out.println(nextsteps);

        char previouSteps = CharacterUtilities.lowerLetterPredecessorStepsOf(letter, numero);
        System.out.println(previouSteps);


        char[] letras = {'a', 'a', 'a', 'a'};
        char[] letrasA = {'b', 'b', 'b', 'b'};

        int characterIn = CharacterUtilities.occurrencesOfCharacterIn(letras, 'a');
        System.out.println(characterIn);

        CharacterUtilities.replaceCharacterIn(letras, 'a', 'z');
        System.out.println(Arrays.toString(letras));

        char[] c = CharacterUtilities.concatenationOf(letras, letrasA);
        System.out.println(Arrays.toString(c));

        char[] copy = CharacterUtilities.copyOfPartOf(new char[] {'1', '2', '3', '4', '5', '8'}, 1, 3);
        System.out.println(Arrays.toString(copy));

        System.out.println(CharacterUtilities.cipher("ola", 3));
        System.out.println(CharacterUtilities.decipher("rod", 3));
    }


}
