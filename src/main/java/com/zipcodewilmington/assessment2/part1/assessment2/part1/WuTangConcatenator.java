package com.zipcodewilmington.assessment2.part1.assessment2.part1;

/**
 * filename:
 * project: question1
 * author: https://github.com/vvmk
 * date: 3/5/18
 */
public class WuTangConcatenator {
    Integer base;

    public WuTangConcatenator(Integer base) {
        this.base = base;
    }

    public boolean isWu() {
        return (base % 3 == 0);
    }

    public boolean isTang() {
        return (base % 5 == 0);
    }

    public boolean isWuTang() {
        return (isWu() && isTang());
    }
}
