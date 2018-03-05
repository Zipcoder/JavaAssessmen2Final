package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {

    Integer numberWu;

    public WuTangConcatenator(int input){
        this.numberWu = input;
    }

    public boolean isWu(){
        if(numberWu % 3 == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean isTang(){
        if(numberWu % 5 == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean isWuTang(){
        if(numberWu % 15 == 0){
            return true;
        } else {
            return false;
        }
    }
}
