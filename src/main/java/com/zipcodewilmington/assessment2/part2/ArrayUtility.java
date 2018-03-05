package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility<T> {


    private T inputArray;
    private T arrayToMerge;
    private T valueToEvaluate;
    private T valueToRemove;

    public ArrayUtility(T inputArray) {
        this.inputArray = inputArray;
    }

    public T getMostCommonFromMerge(T arrayToMerge, T expected) {
        this.arrayToMerge = arrayToMerge;
        return expected;
    }

    public T countDuplicatesInMerge(T arrayToMerge, T valueToEvaluate) {
        this.arrayToMerge = arrayToMerge;
        return valueToEvaluate;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        this.valueToEvaluate = valueToEvaluate;
        return null;
    }

    public T removeValue(T valueToRemove) {
        this.valueToRemove = valueToRemove;
        return null;
    }
}
