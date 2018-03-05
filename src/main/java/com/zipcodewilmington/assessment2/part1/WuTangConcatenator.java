package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    Integer input = 0;

//    public WuTangConcatenator(){
//
//    }

    public WuTangConcatenator(Integer input){
        this.input = input;

    }

    public boolean isWu(){
        boolean answer = false;

        if (input % 3 ==0){
            answer = true;
        }

        return answer;

    }

    public boolean isTang(){
        boolean answer = false;

        if (input % 5 == 0){
            answer = true;
        }

        return answer;
    }

    public boolean isWuTang(){
        boolean answer = false;

        if (input % 15 == 0){
            answer = true;
        }


        return answer;
    }
}
