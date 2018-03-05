package com.zipcodewilmington.assessment2.part6;

public class LoveLetter {


    public LoveLetter() {

    }

    public Integer[] mystery(String[] input) {

        Integer[] intArray = new Integer[input.length];
        int iterator = 0;

        for (int i = 0; i < input.length; i++) {
            intArray[iterator] = evaluateString(input[i]);
            iterator++;
        }

        return intArray;
    }

    private int evaluateString(String aString) {

        int count = 0;

        for (int i = 0; i < aString.length() / 2; i++) {
            count += Math.abs(aString.charAt(i) - aString.charAt(aString.length() - i - 1));
        }

        return count;
    }

}
