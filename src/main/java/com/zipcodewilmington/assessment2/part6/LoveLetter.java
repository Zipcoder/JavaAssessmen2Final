package com.zipcodewilmington.assessment2.part6;

import java.util.ArrayList;

public class LoveLetter {


    public Integer[] mystery (String[] input){
        ArrayList<Integer> outputArray = new ArrayList<Integer>(0);
        for(String s : input){
            outputArray.add(countNumberOfOperations(s));
        }
        return outputArray.toArray(new Integer[0]);
    }

    public static boolean isPalindrome(String stringToTest){

        for(int i = 0; i< stringToTest.length()/2; i++){
            if(stringToTest.charAt(i) == stringToTest.charAt(stringToTest.length()-(1+i))){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static String decrementLetter(String stringToChange, int indexToDecrement){
       char[] workingArray = stringToChange.toCharArray();
       workingArray[indexToDecrement] -= 1;
       return new String(workingArray);
    }

    public static int countNumberOfOperations(String stringToConvert){
        int counter =0;
        if(isPalindrome(stringToConvert)){
            return 0;
        }
        else{

           do{
               for(int i = 0; i<stringToConvert.length()/2; i++){
                   if(stringToConvert.charAt(i) == stringToConvert.charAt(stringToConvert.length()-(1+i))){
                       continue;
                   }
                   else if(stringToConvert.charAt(i) < stringToConvert.charAt(stringToConvert.length()-(1+i)) ){
                       stringToConvert = decrementLetter(stringToConvert,stringToConvert.length()-(1+i));
                       counter++;
                       break;
                   }
                   else {
                       stringToConvert = decrementLetter(stringToConvert,i);
                       counter++;
                       break;
                   }
               }
           }
           while(!isPalindrome(stringToConvert));

        }
        return counter;
    }


}
