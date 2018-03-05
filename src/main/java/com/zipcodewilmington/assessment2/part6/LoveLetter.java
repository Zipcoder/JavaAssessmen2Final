package com.zipcodewilmington.assessment2.part6;

import java.lang.Math;

public class LoveLetter {
    public Integer[] mystery(String[] input) {
        Integer[] out = new Integer[input.length];
        for (int i = 0; i < input.length; i++) {
            out[i] = this.calculateString(input[i]);
        }

        return out;
    }

    private Integer calculateString(String s) {
        Integer totalSteps = 0;
        LetterParts parts = LetterParts.fromString(s);

        if (parts.end == "") {
            return totalSteps;
        }

        for (int i = 0; i < parts.front.length(); i++) {
            char frontChar = parts.front.charAt(i);
            char rearChar = parts.end.charAt(i);
            totalSteps += Math.abs(rearChar - frontChar);

        }

        return totalSteps;
    }

}

