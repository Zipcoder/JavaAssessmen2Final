package com.zipcodewilmington.assessment2.part2;

public class GetNumberOfOccurences {


    Object[] inputArray;
    Integer value;

    public GetNumberOfOccurences(Object[] inputArray, Object count) {

    }



    public static Object getNumberOfOccurrences(Object[] inputArray, Object object) {

        int value = 0;
        for (int x = 0; x < inputArray.length; x++) {
            if (inputArray[x].equals(object)) {
                value++;
            }
        }

        return value;
    }

}
