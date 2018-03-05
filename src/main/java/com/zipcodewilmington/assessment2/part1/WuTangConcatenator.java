package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {

    protected Integer input;


    public WuTangConcatenator(Integer input){
        this.input = input;
    }

    public boolean isWu(){
        if( input % 3 == 0){
            return true;
        }
        return false;
    }

    public boolean isTang() {
        if( input % 5 == 0){
            return true;
        }
        return false;
    }

    public boolean isWuTang() {
        if( input % 3 == 0 && input % 5 == 0){
            return true;
        }
        return false;
    }

}
