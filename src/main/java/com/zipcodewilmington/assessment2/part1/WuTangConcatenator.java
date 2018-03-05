package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;

public class WuTangConcatenator {


    private Integer input;

    WuTangConcatenator(Integer input){
        this.input = input;
    }

    public boolean isWu(){
        if(input%3 == 0) return true;
        else return false;
    }

    public boolean isTang(){
        if(input%5 == 0) return true;
        else return false;
    }

    public boolean isWuTang(){
        if(input%15 == 0) return true;
        else return false;
    }

}
