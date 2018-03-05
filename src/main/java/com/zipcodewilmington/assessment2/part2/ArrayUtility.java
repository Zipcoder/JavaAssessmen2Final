package com.zipcodewilmington.assessment2.part2;


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtility<T> {
    private T[] genericArray;

    public ArrayUtility(T[] inputArray){
        this.genericArray = inputArray;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate){
        T[] mergedArray = mergeArrays(arrayToMerge);
        Integer howManyTimesThisValueShowsUp = 0;
        for(T value : mergedArray){
            if(value == valueToEvaluate){
                howManyTimesThisValueShowsUp++;
            }
        }
        return howManyTimesThisValueShowsUp;
    }

    public T[] mergeArrays(T[] arrayToMerge){
        ArrayList<T> merged = new ArrayList<>();
        merged.addAll(Arrays.asList(genericArray));
        merged.addAll(Arrays.asList(arrayToMerge));
        T[] mergedArray = (T[]) merged.toArray();
        return mergedArray;
    }
}
