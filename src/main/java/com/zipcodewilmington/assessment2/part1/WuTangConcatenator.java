package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    Integer input;

    public WuTangConcatenator(Integer input) {
        this.input = input;
    }

    public boolean isWu() { //multiples of 3
        if (input%3==0) return true;
        else return false;
        }


    public boolean isTang() { //multiples of 5
        if (input%5==0) return true;
        else return false;
    }

    public boolean isWuTang() { //multiples of 15
        if (input%15==0) return true;
        else return false;
    }
}
