package com.zipcodewilmington.assessment2.part2;


import java.util.Arrays;

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

    public T getMostCommonFromMerge(T[] arrayToMerge, T[] inputArray){
        T[] mergedArray = mergeArrays(arrayToMerge, inputArray);


        return getMostCommon(mergedArray);
    }


    public T[] mergeArrays(T[] objectArray, T[] objectArrayToAdd) {
        int originalLength = objectArray.length;
        T[] newArray = Arrays.copyOf(objectArray, objectArray.length + objectArrayToAdd.length);
        int count = 0;
        for (int i = originalLength; i < newArray.length; i++) {
            newArray[i] = objectArrayToAdd[count];
            count++;
        }
        return newArray;
    }

    public T getMostCommon(T[] objectArray) {
        T mostCommon = null;
        int mostCommonCount = 0;
        for (T object: objectArray) {
            int count = 0;
            for (T object2: objectArray) {
                if (object.equals(object2)) {
                    count++;
                }
            }
            if (count > mostCommonCount) {
                mostCommon = object;
                mostCommonCount = count;
            }
        }
        return mostCommon;
    }

}
