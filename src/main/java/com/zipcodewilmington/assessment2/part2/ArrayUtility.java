package com.zipcodewilmington.assessment2.part2;

import java.util.Arrays;

/**
 * filename:
 * project: question1
 * author: https://github.com/vvmk
 * date: 3/5/18
 */
public class ArrayUtility<T> {
    private T[] base;

    public ArrayUtility(T[] base) {
        this.base = base;
    }

    public int countDuplicatesInMerge(T[] arrayToMerge, T valueToCheck) {
        return -1;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        return null;
    }

    public int getNumberOfOccurrences(T objectToCheck) {
        return -1;
    }

    public T[] removeValue(T objectToRemove) {
        return null;
    }

    protected void mergeArrays(T[] arrayToMerge) {
        int newSize = base.length + arrayToMerge.length;
        base = Arrays.copyOf(base, newSize); // base should be referenceing new array that is identical except length = newSize;
        System.arraycopy(arrayToMerge, 0, base, (newSize-arrayToMerge.length), arrayToMerge.length);
    }

    public T[] getBase() {
        return base;
    }
}

