package com.zipcodewilmington.assessment2.part6;

public class LoveLetter {


    public Integer[] mystery(String[] input) {
        Integer[] loveLetterIntegerArray = new Integer[input.length];

        for(int i = 0; i < loveLetterIntegerArray.length-1; i++)
            loveLetterIntegerArray[i] += loveLetterPalindromeCount(input[i]);
        return loveLetterIntegerArray;
    }

    public int loveLetterPalindromeCount(String input) {

        int count = 0;
        for (int ii = 0; ii < input.length(); ii++) {
            String s = input;
            count = 0;
            // use two pointers;
            int i = 0, j = s.length() - 1;
            while (i < j) {
                count += Math.abs(s.charAt(i) - s.charAt(j));
                i++;
                j--;
            }

        }
        return count;
    }
}
