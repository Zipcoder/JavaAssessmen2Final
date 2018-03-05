package com.zipcodewilmington.assessment2.part6;

public class LoveLetter {


    public LoveLetter() {

    }

    public Integer[] mystery(String[] input) {
        return null;
    }

    public Integer testForPalindrome(String[] input) {

        for (String value : input) {
            for (int i = 0; i < value.length(); i++) {
                for (int n = i + 1; n <= value.length(); n++) {
                    StringBuilder sb = new StringBuilder(value.substring(i, n));
                    if (sb.toString().equalsIgnoreCase(sb.reverse().toString())) {
                        return 0;
                    }
                }
            }
        }
        return findReducedNumber(input);
    }

    public Integer findReducedNumber(String [] input){

        for (String value : input){
            char[] chars = value.toCharArray(); // char array of our letters in each word
             if (chars[0] < chars [chars.length -1]);

        }

        return null;
    }
}

