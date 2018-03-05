package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility<T> {

    private T[] array;

    public ArrayUtility(T[] anArray) {
        this.array = anArray;
    }


    public Integer countDuplicatesInMerge(T[] anotherArray, T aValue) {

        Integer countOfValue = 0;

        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i].equals(aValue)) {
                countOfValue++;
            }
        }

        for (int j = 0; j < anotherArray.length; j++) {
            if (anotherArray[j].equals(aValue)) {
                countOfValue++;
            }
        }

        return countOfValue;
    }
}
