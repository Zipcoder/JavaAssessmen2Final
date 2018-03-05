package com.zipcodewilmington.assessment2.part6;

import java.util.Arrays;
import java.util.Scanner;

public class LoveLetter {


   public Integer[] mystery(String[] input){
       StringBuilder sb = new StringBuilder();
       int count = 0;
       for (String input1 : input) {
           for (int i = 0; i < input1.length() / 2; i++) {
               count += Math.abs(input1.charAt(i) - input1.charAt(input1.length() - i - 1));
           }
           sb.append(count + ",");
           count = 0;
       }
       Integer[] intArray = new Integer[input.length];
       String[] intString = sb.toString().split(",");

       return getIntegers(intString, intArray);
   }
   
    private static Integer[] getIntegers(String[] intString, Integer[] intArray) {
        if (!intString[0].equals("")) {

            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = Integer.parseInt(intString[i]);
            }

            return intArray;

        } else {
            return new Integer[0];
        }
    }


}
