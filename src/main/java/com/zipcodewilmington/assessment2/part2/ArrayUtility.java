package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayUtility<E> {

    private E[] objects;
    private Integer valueToEvaluate;
    private ArrayList<E> list;

    public ArrayUtility(E[] theObects) {
        this.objects = theObects;
        list = new ArrayList<>();

        Collections.addAll(list, theObects);
    }


//ArrayUtility<Integer> arrayUtility = new ArrayUtility<>(inputArray);

    public E getMostCommonFromMerge(E[] arrayToMerge, E valueToEvaluate) {
        for (int i = 0; i < arrayToMerge.length; i++) {

            Collections.addAll(list, arrayToMerge);
        }
        return arrayToMerge[0];
    }

    public E[] removeValue(E value) {
        for (E object : list) {
            if (object.equals(value)) {
                list.remove(object);
            }
        }
      // return list.toArray(new E[0]);
   return null;
    }

}
