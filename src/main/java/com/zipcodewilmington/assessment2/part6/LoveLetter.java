package com.zipcodewilmington.assessment2.part6;

import java.util.Arrays;

public class LoveLetter {

    public  LoveLetter(){

    }

    public Integer[]mystery(String[] input){
        Integer[]myResult = new Integer[0];
        int myResultIndex=0;
        for(int index =0;index<input.length;index++){
            myResult = Arrays.copyOf(myResult,myResult.length+1);
            myResult[myResultIndex]=countToPalindrom(input[index]);
        }
        System.out.println(myResult);
        return myResult;
    }


    public int countToPalindrom(String str){
        int result;
        StringBuilder builder = new StringBuilder(str);
        String reverseString = builder.reverse().toString();
        if(str==reverseString){
            result =0;
        }else {
            char[] myChar = str.toCharArray();
            if (str.length() % 2 == 0) {
                char[] frontHalf = new char[str.length() / 2];
                char[] backHalf = new char[str.length() / 2];
                for (int i = 0; i < str.length() / 2; i++) {
                    frontHalf[i] = myChar[i];
                }
                int j = 0;
                for (int i = str.length() - 1; i >= str.length()/2; i--) {
                    backHalf[j] = myChar[i];
                    j++;
                    while (j > myChar.length / 2) ;
                    {
                        break;
                    }
                }
                result =reduceLetters(frontHalf, backHalf, myChar.length / 2);
            }else{
                char[] frontHalf = new char[str.length() / 2];
                char[] backHalf = new char[str.length() / 2];
                for (int i = 0; i < str.length() / 2; i++) {
                    frontHalf[i] = myChar[i];
                }
                int j = 0;
                for (int i = str.length() - 1; i >str.length()/2; i--) {
                    backHalf[j] = myChar[i];
                    j++;
                    while (j > myChar.length / 2) ;
                    {
                        break;
                    }
                }
               result = reduceLetters(frontHalf, backHalf, myChar.length / 2);



            }
        }
        return result;
    }

    public int reduceLetters(char[] beginning, char[] ending, int length){
        int counter =0;
        for(int k =0;k<length;k++){
            if(beginning[k]!=ending[k]){
                char largest = findLargerLetter(beginning[k],ending[k]);
                if(largest==beginning[k]){
                    counter+=beginning[k]-ending[k];
                }else{
                    counter+=ending[k]-beginning[k];
                }
            }
        }
        return counter;

    }

    public char findLargerLetter(char char1, char char2){
        int largest =char2;
        if(char1>char2){
            largest = char1;
        }
        return (char)largest;
    }

}
