package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {

    private Integer input;

    public WuTangConcatenator(Integer input) {
        this.input = input;
    }

    public boolean isWu() {
        boolean isWu = false;
        if ( (input % 3 == 0) && (input % 5 == 0) ) {
            return isWu;
        } else if (input % 3 == 0) {
            isWu = true;
        }
        return isWu;
    }

    public boolean isTang() {
        boolean isTang = false;
        if ( (input % 3 == 0) && (input % 5 == 0) ) {
            return isTang;
        } else if (input % 5 == 0) {
            isTang = true;
        }
        return isTang;
    }

    public boolean isWuTang() {
        boolean isWuTang = false;

        return isWuTang;
    }


}
