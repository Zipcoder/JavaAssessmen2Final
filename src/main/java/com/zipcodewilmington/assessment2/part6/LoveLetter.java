package com.zipcodewilmington.assessment2.part6;

import java.util.Arrays;

public class LoveLetter {
private static final String letters = "ABCDEFGHIJKLMNOP";
int distance;
int locationInAlphabet;

    public static String reverse(String stringToCheck) {
        StringBuilder revOrder = new StringBuilder(stringToCheck);
        return revOrder.reverse().toString();
    }

    public boolean isPalindromic(String stringToCheck) {
        return stringToCheck.equals(reverse(stringToCheck));
    }

    public int getAlphabetIndex(char char1) {
        return locationInAlphabet = letters.indexOf(char1);
    }

    public Integer[] mystery(String[] input) {
        Integer[] resultArr = new Integer[input.length];
        for(int i = 0; i < input.length; i++) {
            if (!isPalindromic(input[i])) {
                int halfWayPoint = (int) Math.floor(input[i].length() / 2);
                for(int j = halfWayPoint; j < input[i].length(); j++) {
                    distance = (getAlphabetIndex(input[i].charAt(i)) - getAlphabetIndex(input[i].charAt(j)));

                    resultArr[i] = distance;
                }
            }
        }
        return resultArr;
    }

//    public Integer[] mystery(String[] input) {
//        Integer[] result = new Integer[input.length];
//        int index = 0;
//        for(int i = 0; i < input.length; i++) {
//            if(!isPalindromic(input[i])){
//                 input[i].charAt(i)
//            index++;
//            } else {
//                result[index] = 0;
//                index++;
//            }
//        }
//        return result;
//    }
}



















