package com.zipcodewilmington.assessment2.part6;

public class LoveLetter {



    public Integer[] mystery(String[] input) {
        Integer[] moves = new Integer[input.length];
        for (int i = 0; i < input.length; i++) {
            if(countPalindromes(input[i]) == 0) {
                moves[i] = 0;
            }
                moves[i] = countPalindromes(input[i]);
        }

        return moves;
    }

    private int countPalindromes(String input) {
        int counter = 0;
        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            counter += Math.abs(input.toCharArray()[i] - input.toCharArray()[length - i - 1]);
        }
        return counter;
    }
}

