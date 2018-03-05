package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {

    private Integer input;

    public WuTangConcatenator(Integer input) {
        this.input = input;
    }

    /* Corrections to tests */
    /*  testSix()
        Integer input = 6;
        Assert.assertFalse(isWu); // multiple of 3  --> test should be assertTrue
        Assert.assertTrue(isTang); // multiple of 5 --> test should be assertFalse
        Assert.assertFalse(isWuTang); // multiple of 15 --> this is correct
     */

    // multiple of 3
    public boolean isWu() {
        boolean isWu = false;
        if (input % 3 == 0) {
            isWu = true;
        }
        return isWu;
    }

    // multiple of 5
    public boolean isTang() {
        boolean isTang = false;
        if (input % 5 == 0) {
            isTang = true;
        }
        return isTang;
    }

    // multiple of 3 and 5
    public boolean isWuTang() {
        boolean isWuTang = false;
        if ( (input % 3 == 0) && (input % 5 == 0) ) {
            isWuTang = true;
        }
        return isWuTang;
    }


}
