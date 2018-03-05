package com.zipcodewilmington.assessment2.part6;

import java.lang.Character;

public class LoveLetter {

    public LoveLetter() {
    }

    public Integer[] mystery(String[] input) {
        Integer[] numberOfOperationsPerWordArray = new Integer[input.length];

        for (int i = 0; i < input.length; i++) {
            String word = input[i];
            int numberOfOperationsPerWord = this.getNumberOfOperations(word);
            numberOfOperationsPerWordArray[i] = numberOfOperationsPerWord;
        }
        return numberOfOperationsPerWordArray;
    }

    public int getNumberOfOperations(String word) {
        int numberOfOperations = 0;

        int headIndex = 0;
        int tailIndex = word.length() - 1;
        while (headIndex < tailIndex) {
            char headChar = word.charAt(headIndex);
            char tailChar = word.charAt(tailIndex);
            int headCharNumberValue = Character.getNumericValue(headChar);
            int tailCharNumberValue = Character.getNumericValue(tailChar);

            if (headCharNumberValue < tailCharNumberValue) {
                numberOfOperations += (tailCharNumberValue - headCharNumberValue);
            } else if (headCharNumberValue > tailCharNumberValue) {
                numberOfOperations += (headCharNumberValue - tailCharNumberValue);
            }
            headIndex++;
            tailIndex--;
        }
        return numberOfOperations;
    }

    public static void main(String[] args) {
        String word = "abc";
        LoveLetter loveLetter = new LoveLetter();
        int number = loveLetter.getNumberOfOperations(word);
        System.out.println(number);

    }

}
