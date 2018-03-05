package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {

    private Integer number;

    public WuTangConcatenator(Integer number) {
        this.number = number;
    }

    public boolean isWuTang() {
        if (this.number % 3 == 0 && this.number % 5 == 0) {
            return true;
        }
        return false;
    }

    public boolean isTang() {
        if (this.number % 5 == 0) {
            return true;
        }
        return false;
    }

    public boolean isWu() {
        if (this.number % 3 == 0) {
            return true;
        }
        return false;
    }
}



