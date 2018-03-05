package com.zipcodewilmington.assessment2.part6;

/**
 * filename:
 * project: question1
 * author: https://github.com/vvmk
 * date: 3/5/18
 */
public class LoveLetter {

    protected char tryReduceChar(char letter) {
        int comp = (letter < 97) ? Character.toLowerCase(letter) : letter;
        return (Integer.compare(comp, 97) > 0) ? (char)(letter - 1) : letter;
    }

    public Integer[] mystery(String[] input) {
        return null;
    }
}
