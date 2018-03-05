package com.zipcodewilmington.assessment2.part2;


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtility<T> {
    private T[] genericArray;

    public ArrayUtility(T[] inputArray){
        this.genericArray = inputArray;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate){
        T[] mergedArray = mergeArrays(genericArray, arrayToMerge);
        Integer howManyTimesThisValueShowsUp = 0;
        for(T value : mergedArray){
            if(value == valueToEvaluate){
                howManyTimesThisValueShowsUp++;
            }
        }
        return howManyTimesThisValueShowsUp;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge, T[] inputArray){
        T[] mergedArray = mergeArrays(inputArray, arrayToMerge);
        int count = 0;
        int tempCount;
        T mostFreq = mergedArray[0];
        T currentObjectObserved;
        //search for the most freq
        for(int i = 0; i < mergedArray.length; i++){
            currentObjectObserved = mergedArray[i];
            tempCount = 1;
            for(int j = 1; j <mergedArray.length; j++){
                if(currentObjectObserved == mergedArray[j]){
                    tempCount++;
                }
            }
            if(tempCount > count){
                mostFreq = currentObjectObserved;
                count = tempCount;
            }
        }
        return mostFreq;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate){
        Integer howManyTimesThisValueShowsUp = 0;
        for(T value : genericArray){
            if(value == valueToEvaluate){
                howManyTimesThisValueShowsUp++;
            }
        }
        return howManyTimesThisValueShowsUp;
    }

    public T[] removeValue(T valueToRemove){
        ArrayList<T> itsLit = new ArrayList<>();
        for(T value : genericArray){
            if(!value.equals(valueToRemove)){
                itsLit.add(value);
            }
        }
        T[] returnArray = (T[]) itsLit.toArray();
        return returnArray;
    }

    public T[] mergeArrays(T[] originalArray, T[] arrayToMerge){
        ArrayList<T> merged = new ArrayList<>();
        merged.addAll(Arrays.asList(originalArray));
        merged.addAll(Arrays.asList(arrayToMerge));
        T[] mergedArray = (T[]) merged.toArray();
        return mergedArray;
    }
}
