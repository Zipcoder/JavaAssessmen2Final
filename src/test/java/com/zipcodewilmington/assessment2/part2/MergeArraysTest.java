package com.zipcodewilmington.assessment2.part2;

import org.junit.Assert;
import org.junit.Test;

/**
 * filename:
 * project: question1
 * author: https://github.com/vvmk
 * date: 3/5/18
 */
public class MergeArraysTest {
    @Test
    public void testMergeArrays() {
        Integer[] base = {1, 2, 3};
        Integer[] arrayToMerge = {4, 5, 6};
        ArrayUtility<Integer> util = new ArrayUtility<>(base);

        Integer[] expected = {1, 2, 3, 4, 5, 6};
        util.mergeArrays(arrayToMerge);

        Integer[] actual = util.getBase();

        Assert.assertEquals(expected, actual);
    }
}
