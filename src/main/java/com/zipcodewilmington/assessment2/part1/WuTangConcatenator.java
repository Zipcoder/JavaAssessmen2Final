package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    private boolean isWu;
    private boolean isTang;
    private boolean isWuTang;
    Integer value;

    WuTangConcatenator(Integer value) {
        if (value % 3 == 0) {
            isWu = true;
        } else if (value % 5 == 0) {
            isTang = true;
        } else if (value % 3 == 0 && value % 5 == 0) {
            isWuTang = true;
        }
    }
    public boolean isWu(){
        return isWu;
    }
    public boolean isTang(){
        return isTang;
    }
    public boolean isWuTang(){
        return isWuTang;
    }
}
