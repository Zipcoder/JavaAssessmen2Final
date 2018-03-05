package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility<E> {

    private E[] inputArray;

    public ArrayUtility(E[] inputArray) {
        this.inputArray = inputArray;
    }

    public E[] getInputArray() {
        return inputArray;
    }

    public Integer countDuplicatesInMerge(E[] arrayToMerge, E valueToEvaluate) {
        Integer counter = 0;
        return null;
    }

    public E getMostCommonFromMerge(E[] arrayToMerge, E expected) {
        return null;
    }

    public Integer getNumberOfOccurrences(E valueToEvaluate) {
        Integer counter = 0;
        for (int i = 0; i < getInputArray().length; i++) {
            if (getInputArray()[i].equals(valueToEvaluate)) {
                counter++;
            }
        }
        return counter;
    }

    public E[] removeValue(E valueToRemove) {
        return null;
    }

}
