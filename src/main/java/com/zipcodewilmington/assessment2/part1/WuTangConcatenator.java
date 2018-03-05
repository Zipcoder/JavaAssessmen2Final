package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    private int input;

    public WuTangConcatenator(int input){
        this.input = input;

    }

    public boolean isWu(){
        return this.input % 3==0;
    }

    public boolean isTang(){
        return this.input % 5==0;
    }

    public boolean isWuTang(){
        return this.input % 15==0;
    }


}
