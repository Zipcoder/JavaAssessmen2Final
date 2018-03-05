package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {

    private boolean isWu = false;
    private boolean isTang = false;
    private boolean isWuTang = false;

    public WuTangConcatenator(Integer anInt) {
        if (anInt % 3 == 0) {
            isWu = true;
        }

        if (anInt % 5 == 0) {
            isTang = true;
        }

        if (anInt % 15 == 0) {
            isWuTang = true;
        }

    }

    public boolean isWu() {
        return isWu;
    }

    public boolean isTang() {
        return isTang;
    }

    public boolean isWuTang() {
        return isWuTang;
    }

}
