package com.zipcodewilmington.assessment2.part6;

public class LoveLetter {

    public String getStringfromArray(String[] input) {
            StringBuilder builder = new StringBuilder();
            for (String word : input) {
                builder.append(word);
            }
            String str = builder.toString();
            return str;
    }

    public Integer[] mystery(String[] input) {
        String words = getStringfromArray(input);
        int numOfMoves = 0;
        for (int i = 0; i < input.length / 2; i++) {
            if (words.charAt(i) != words.charAt(words.length() - 1 - i)) {
                numOfMoves += Math.abs(words.charAt(words.length() - 1 - i) - words.charAt(i));
            }
        }
        String temp = Integer.toString(numOfMoves);
        Integer[] returnType = new Integer[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            returnType[i] = temp.charAt(i) - '0';

        }
        return returnType;
    }
}
