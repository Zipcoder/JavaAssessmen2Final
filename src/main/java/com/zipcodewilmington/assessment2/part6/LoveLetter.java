package com.zipcodewilmington.assessment2.part6;

import java.util.ArrayList;

public class LoveLetter {
    public Integer[] mystery(String[] input) {
        ArrayList<Integer> operationList = new ArrayList<>();
        for (String letter : input) {
            String buffer = letter;
            Integer operationCount = 0;
            boolean isAPal;
            do {
                isAPal = isPalindrome(buffer);
                if (isAPal != true) {
                    buffer = newOperation(buffer);
                    operationCount++;
                }
            } while (isAPal == false);
            operationList.add(operationCount);
        }
        Integer[] operationsArray = operationList.toArray(new Integer[operationList.size()]);
        return operationsArray;
    }


    public boolean isPalindrome(String input) {
        int i = 0;
        int j = input.length() -1;
        while (j>i){
            if(input.charAt(i) != input.charAt(j)){
                return false;
            }
            ++i;
            --j;
        }

        return true;
    }

    public String newOperation(String input){
        StringBuilder newString = new StringBuilder();
        newString.append(input);
        int i = 0;
        int j = input.length() -1;
        while (j>i){
            if(input.charAt(i) != input.charAt(j)){
                if(input.charAt(i) > input.charAt(j)) {
                    char buffer = (char) (input.charAt(i) - 1);
                    newString.setCharAt(i, buffer);
                    return newString.toString();
                } else{
                    char buffer = (char) (input.charAt(j) - 1);
                    newString.setCharAt(j, buffer);
                    return newString.toString();
                }
            }
            ++i;
            --j;
        }
        return newString.toString();
    }
}
