package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayUtility<T> {

    private T[] objects;
    private Integer valueToEvaluate;
    private ArrayList<T> list;

    public ArrayUtility(T[] theObects) {
        this.objects = theObects;
        list = new ArrayList<>();
        if (theObects != null) {
            Collections.addAll(list, theObects);
        }
    }


    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        return 0;
    }

//ArrayUtility<Integer> arrayUtility = new ArrayUtility<>(inputArray);

    public T getMostCommonFromMerge(T[] arrayToMerge, T valueToEvaluate) {
        for (int i = 0; i < arrayToMerge.length; i++) {

            Collections.addAll(list, arrayToMerge);
        }
        return arrayToMerge[0];
    }

    public T[] removeValue(T value) {
        for (T object : list) {
            if (object.equals(value)) {
                list.remove(object);
            }
        }
        return (T[]) list.toArray();

    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        return 0;
    }

}
