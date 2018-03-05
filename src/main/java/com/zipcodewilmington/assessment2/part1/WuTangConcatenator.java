package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {

    private Integer input;

    public WuTangConcatenator(Integer input){
        this.input = input;
    }

    public boolean isWu(){
        if (this.input %3 == 0){
            return true;
        }
        return false;
    }

    public boolean isTang(){
        if (this.input %5 == 0){
            return true;
        }
        return false;
    }

    public boolean isWuTang(){
        if (this.input %3 == 0 && this.input %5 == 0){
            return true;
        }
        return false;
    }
}
