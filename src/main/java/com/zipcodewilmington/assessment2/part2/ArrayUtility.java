package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility<T> {

    public Integer value;


    ArrayUtility<T> arrayUtils = new ArrayUtility<>();

    public ArrayUtility(ArrayUtility<T> arrayUtils) {
        this.arrayUtils = arrayUtils;
    }

    public ArrayUtility() {

    }


    public Integer countDuplicatesInMerge(Integer[] arrayToMerge, T valueToEvaluate) {
        Integer count = 0;
        for (int i = 0; i < arrayToMerge.length; i++){
            if (valueToEvaluate == arrayToMerge[i]){
                count++;
            }
        }
        return count;
    }
}
