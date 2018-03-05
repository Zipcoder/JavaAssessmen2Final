package com.zipcodewilmington.assessment2.part6;

import java.util.ArrayList;

public class LoveLetter {


    public Integer[] mystery(String[] input){
        ArrayList<Integer> numberOfOperationsArray = new ArrayList<Integer>();
        for (String inputString: input) {

            Integer numberOfOperations = 0;
            while(checkIfPalindrome(inputString)){
                inputString = modifyCharInString(inputString);
                numberOfOperations++;
            }
            numberOfOperationsArray.add(numberOfOperations);
        }
        Integer[] returnArray = new Integer[numberOfOperationsArray.size()];
        for (int i = 0; i < returnArray.length; i++){
            returnArray[i] = numberOfOperationsArray.get(i);
        }
        return returnArray;
    }

    private boolean checkIfPalindrome(String input) {
        StringBuilder inputReversed = new StringBuilder(input);
        inputReversed.reverse();
        if (inputReversed.toString().equals(input)){
            return false;
        } else {
            return true;
        }
    }

    private String modifyCharInString(String input){
        char[] charArray = input.toCharArray();
        int firstPosition = 0;
        int secondPosition = charArray.length -1;
        while (charArray[firstPosition] == charArray[secondPosition]){
            firstPosition++;
            secondPosition--;
        }
        if (charArray[firstPosition] < charArray[secondPosition]){
            charArray[secondPosition]--;
        } else if (charArray[firstPosition] > charArray[secondPosition]){
            charArray[firstPosition]--;
        }
        String returnString = new String(charArray);
        return returnString;
    }

}
