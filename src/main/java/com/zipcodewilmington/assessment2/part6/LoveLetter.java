package com.zipcodewilmington.assessment2.part6;

public class LoveLetter {


    public Integer[] mystery(String[] input){
        Integer[] counts = new Integer[input.length];

        for (int i = 0; i <= input.length; i++){

            StringBuilder sb = new StringBuilder(input[i]);

            for (int x = 0; x <= sb.length()/2; x++) {
               Integer count = 0;
                char reverse = sb.charAt(sb.length() - x);
                while (x != reverse){
                    sb.setCharAt(sb.charAt(sb.length() - x), (char) (sb.charAt(sb.length() - x) -1));
                    count++;

                }
                    counts[i] = count;

                }




            }
            return counts;
        }





    }

