package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {

    private int currentInput;

    public WuTangConcatenator(int input) {
        this.currentInput = input;
    }

    public boolean isWu() {
        return (currentInput % 3 == 0);
    }

    public boolean isTang() {
        return (currentInput % 5 == 0);
    }

    public boolean isWuTang() {
        return (isWu() && isTang());
    }

}
