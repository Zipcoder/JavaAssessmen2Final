package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;

public class ArrayUtility<T> {

    private T[] inputArray;

    public ArrayUtility(T[] inputArray){
        this.inputArray = inputArray;
    }


    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate){
        Integer duplicateAmount = 0;
        for (T value: this.inputArray) {
            if (valueToEvaluate.equals(value)){
                duplicateAmount++;
            }
        }
        for (T value: arrayToMerge) {
            if (valueToEvaluate.equals(value)){
                duplicateAmount++;
            }
        }
        return duplicateAmount;
    }

    public Integer g
}
