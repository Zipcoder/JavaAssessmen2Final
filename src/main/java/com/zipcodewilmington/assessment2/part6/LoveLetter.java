package com.zipcodewilmington.assessment2.part6;

public class LoveLetter {


    public Integer[] mystery(String[] input) {
        Integer[] numbers = new Integer[input.length];
        for (int i = 0; i < input.length; i++) {
            for (int k = 0; k < input[i].length(); k++) {
                int count = 0;
                for (int n = 0; n < input[i].length() / 2; n++) {
                    count += Math.abs(Character.codePointAt(input[i], n) - Character.codePointAt(input[i], input[i].length() - n - 1));
                }
                numbers[i] = count;
            }
        }
        return numbers;
    }



}



