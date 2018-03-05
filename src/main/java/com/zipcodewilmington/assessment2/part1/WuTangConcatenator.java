package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
<<<<<<< HEAD
    private Integer number;

    public WuTangConcatenator(Integer number){
        this.number = number;
    }

    public boolean isWuTang(){
        if (this.number % 3 == 0 && this.number % 5 == 0){
            return true;
        }   return false;
    }

    public boolean isTang(){
        if (this.number % 5 == 0){
            return true;
        }  return false;
    }

    public boolean isWu(){
        if (this.number % 3 == 0){
            return true;
        } return false;
    }
}
=======

    public WuTangConcatenator(Integer input) {
        if ( input % 3 == 0 && input % 5 == 0) {
             }
//        else if ( input % 3 == 0) { return isTang();
//             }
//        else if ( input % 5 == 0) {
//    }

    }

    public boolean isWu() {
        return isWu();
    }

    public boolean isTang() {
        return isTang();
    }

    public boolean isWuTang() {
        return isWuTang();
    }
}
>>>>>>> part4
