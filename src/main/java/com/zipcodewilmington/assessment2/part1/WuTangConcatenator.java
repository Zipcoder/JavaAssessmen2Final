package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {

    private Integer integerN;

    public WuTangConcatenator(Integer input){
        this.integerN = input;
    }

    public boolean isWu(){
        if (integerN % 3 == 0) {
            return true;
        }
        return false;
    }

    public boolean isTang(){
        if (integerN % 5 == 0) {
            return true;
        }
        return false;
    }

    public boolean isWuTang(){
        if (integerN % 5 == 0  && integerN % 3 == 0) {
            return true;
        }
        return false;
    }
    }


