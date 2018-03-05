package com.zipcodewilmington.assessment2.part6;

public class LoveLetter {


    public Integer countPalindromeMoves(String input) {
        int palindromeMoves = 0;
        StringBuilder change = new StringBuilder(input);

        for (int i = 0; i <= input.length(); i++){
            for (int j = i+1; j <= input.length()-1; j++){
                if (input.charAt(i) != (input.charAt(input.length()-1-i))) {
                }
                else palindromeMoves += 1;
            }
        }
        return palindromeMoves;
    }
    public Integer[] mystery (String[] array){
        Integer[] countMoves = new Integer[array.length];
        for (int i =0; i < array.length; i++) {
            countPalindromeMoves(array[i]);
        }
        return countMoves;

    }
}
