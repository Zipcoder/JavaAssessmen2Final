package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    Integer input;


    public WuTangConcatenator(Integer input) {
        this.input = input;
    }

    public boolean isWu() {
        return input % 3 == 0;
    }

    public boolean isTang() {
        return input % 5 == 0;
    }

    public boolean isWuTang() {
        return input % 5 == 0 && input % 3 ==0;
    }
}
