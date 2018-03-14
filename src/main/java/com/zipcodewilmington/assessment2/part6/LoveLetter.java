package com.zipcodewilmington.assessment2.part6;

public class LoveLetter {

    //private String[] input = {};

    public LoveLetter(){

    }

    public static Integer countPalindromes(String input1){

        Integer numOfPalindromes = 0;

        for (int i = 0; i <= input1.length(); i++){
            for (int j = i+1; j <= input1.length(); j++){
                StringBuilder reverseMyInput = new StringBuilder(input1.substring(i,j));
                reverseMyInput.reverse();
                if (input1.substring(i,j).equals(reverseMyInput.toString())){
                    numOfPalindromes++;
                }
            }
        }


        return numOfPalindromes;
    }

    public static Integer[] mystery(String[] input) {
        Integer[] answerArray = new Integer[input.length];

        for (int i = 0; i <input.length; i++){
            answerArray[i] = countPalindromes(input[i]);
        }

        return answerArray;
    }

}
