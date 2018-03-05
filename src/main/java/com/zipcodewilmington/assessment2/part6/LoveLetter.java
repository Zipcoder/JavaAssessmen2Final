package com.zipcodewilmington.assessment2.part6;

import java.util.ArrayList;

public class LoveLetter {


    public LoveLetter() {

    }

    public Integer[] mystery(String[] input) {
        ArrayList<Integer> arrList = new ArrayList<>();
        Integer count = 0;

        for (String value : input) {
            char[] chars = value.toCharArray();
            for (int i = 0; i < value.length(); i++) {
                for (int j = chars.length; j <= 0; j--) {

                    char beginning = chars[i];
                    char ending = chars[j];

                    if (beginning == ending)
                        arrList.add(0);

                    if (beginning > ending) {
                        count = (beginning - ending);
                        arrList.add(count);
                    }

                    if (ending > beginning) {
                        count = (ending - beginning);
                        arrList.add(count);
                    }
                }

            }

        }
        ArrayList<Integer> result = new ArrayList<>();
        Integer sum = 0;
        for (Integer num : arrList) {
            sum += num;
            result.add(sum);
        }
        return result.toArray(new Integer[input.length]);
    }
}



