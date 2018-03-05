package com.zipcodewilmington.assessment2.part6;

public class LoveLetter {

    public LoveLetter(){

    }

    public Integer[] mystery(String[] input){

        Integer[] finalArray = new Integer[input.length];

        for(int i = 0; i < input.length; i++){
            finalArray[i] = convertToPalindrome(input[i]);
        }

        return finalArray;
    }


    public int convertToPalindrome(String word){
        StringBuilder reverse = new StringBuilder(word).reverse();

        int counter = 0;

        for(int idx = 0; idx < word.length()/2; idx++) {
            if (word.charAt(idx) < reverse.charAt(idx)) {
                reverse.setCharAt(idx, word.charAt(idx));
                counter++;
            }else{
                break;
            }
        }

        return counter;
    }

}
