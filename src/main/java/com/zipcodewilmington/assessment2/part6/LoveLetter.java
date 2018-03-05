package com.zipcodewilmington.assessment2.part6;

import java.util.ArrayList;

public class LoveLetter {
    //isALoveLetter
   private ArrayList<Integer> list = new ArrayList<>();
    public LoveLetter() {
    list = new ArrayList<>();
    }
    

    public Integer[] mystery(String[] loveLetter) {

       int temp = 0;
        for (int i = 0; i < loveLetter.length; i++) {
           add(countNumberOfOpperations(loveLetter[i]));
        }

        return list.toArray(new Integer[0]);
    }

    public void add(Integer number){
        list.add(number);
    }

    public Integer countNumberOfOpperations(String love) {
        int count = 0;
        char[] letters = love.toCharArray();
        for (int i = 0; i < Math.ceil(letters.length) / 2; i++) {
            char current = Character.toLowerCase(letters[i]);
            char opposite = Character.toLowerCase(letters[letters.length - 1 - i]);
            count += Math.abs(current - opposite);
        }
        return count;
    }

}
