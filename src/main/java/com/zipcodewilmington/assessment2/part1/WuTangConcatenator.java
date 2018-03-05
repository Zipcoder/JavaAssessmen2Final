package com.zipcodewilmington.assessment2.part1;


public class WuTangConcatenator {
    public WuTangConcatenator(Integer input) {
        int i = input;


    }

     int i;



    public boolean isWu() {
        if (i / 3 == 0) {
            return true;
        } else {
            return false;
        }


    }

    public boolean isTang() {
        if (i % 5 == 0) {
            return true;
        } else {
            return false;
        }


    }

    public boolean isWuTang() {
        if (i % 15 == 0) {
            return true;
        } else {
            return false;
        }


    }
}



