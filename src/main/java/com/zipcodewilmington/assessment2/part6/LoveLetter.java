package com.zipcodewilmington.assessment2.part6;

import static oracle.jrockit.jfr.events.Bits.charValue;

public class LoveLetter {

    LoveLetter() {

    }

    public Integer[] mystery(String[] letters) {
        Integer[] palandromic = new Integer[letters.length];
        for (int i = 0; i < letters.length; i++) {
            String letter = letters[i];
            int counter = 0;
            for (int j = 0; j < letter.length(); j++) {
                    char front = letter.charAt(j);
                    char back = letter.charAt(letter.length() - 1 - j);
                    while(charValue(front) != charValue(back))
                    if (charValue(front) < charValue(back)) {
                        while (charValue(front) < charValue(back)) {
                            int var = charValue(back) -1;
                            back = (char) var;
                        }
                    } else if (charValue(front) > charValue(back)) {
                        while (charValue(front) > charValue(back)) {
                            int var2 = charValue(front) - 1;
                            front = (char) var2;
                            counter++;
                        }
                    }
            }
            palandromic[i] = counter;
        }
        return palandromic;
    }
}
