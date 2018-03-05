package com.zipcodewilmington.assessment2.part2;

import java.util.Arrays;

public class ArrayUtility<T> {

    T[] inputArray;

    public ArrayUtility(T[] input){
        this.inputArray = input;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate){
        T[] mergedArray = Arrays.copyOf(inputArray, inputArray.length);
        for(int i = 0; i < arrayToMerge.length; i++){
            mergedArray = Arrays.copyOf(mergedArray, mergedArray.length+1);
            mergedArray[i] = arrayToMerge[i];
        }
        Integer outputCounter = 0;
        for(T t : mergedArray){
            if(t == valueToEvaluate){
                outputCounter++;
            }
        }
        return outputCounter;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge, T[] inputArray ){
        return null;
    }

    public Integer getNumberOfOccurrences(T valueToCount){
        return 0;
    }

    public T[] removeValue(T valueToRemove){
        return null;
    }

}
