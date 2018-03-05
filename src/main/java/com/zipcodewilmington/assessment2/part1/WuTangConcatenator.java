package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {

<<<<<<< HEAD

    Integer input;

    public WuTangConcatenator(Integer input) {
        this.input = input;
    }


    public boolean isWu() {
        return (input % 3 ==0);
    }

    public boolean isTang() {
        return (input % 5 ==0);
    }

    public boolean isWuTang() {
        return (input % 3 ==0 && input % 5 ==0);
    }
}
=======
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


>>>>>>> part4
