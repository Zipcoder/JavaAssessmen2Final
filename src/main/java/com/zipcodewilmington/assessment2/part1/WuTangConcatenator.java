package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;

public class WuTangConcatenator {

    private Integer input;

    public WuTangConcatenator(Integer input) {
        this.input = input;
    }

    public boolean isWu(){
        if(this.input%3 == 0){
            return true;
        }
        return false;
    }

    public boolean isTang() {
        if(this.input%5 == 0){
            return true;
        }
        return false;
    }

    public boolean isWuTang() {
        if(this.input%3 == 0 && this.input%5 == 0){
            return true;
        }
        return false;
    }
}

/**Create a class WuTangConcatenator which uses a composite Integer to identify divisibility.
 Multiples of 3 are considered Wu numbers.
 Multiples of 5 are considered Tang numbers.
 Multiples of 3 and 5 are considered WuTang numbers.*/