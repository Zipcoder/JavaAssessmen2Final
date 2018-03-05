package com.zipcodewilmington.assessment2.part6;

import java.util.Arrays;
import java.util.Scanner;

public class LoveLetter {


   public Integer[] mystery(String[] input){
       Integer[] intArray = new Integer[input.length];
       for (int i = 0; i < input.length; i++){
           intArray[i] = countPalindromeChange(input);
       }
       return intArray;
   }

   public int countPalindromeChange(String[] input) {
       int count = 0;
       for (String input1 : input) {
           for (int i = 0; i < input1.length() / 2; i++) {
               count += Math.abs(input1.charAt(i) - input1.charAt(input1.length() - i - 1));
           }
       }
       return count;
   }

    public static void main(String[] args) {

    }

}
//               Math.abs(string.charAt(i) - string.charAt(string.length() - i - 1));
