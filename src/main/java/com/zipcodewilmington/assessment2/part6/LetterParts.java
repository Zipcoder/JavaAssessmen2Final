package com.zipcodewilmington.assessment2.part6;

public class LetterParts {
    protected String front;
    protected String middle;
    protected String end;

    public LetterParts() {
        this.front = "";
        this.middle = "";
        this.end = "";
    }

    public static LetterParts fromString(String s) {
        LetterParts part = new LetterParts();
        switch (s.length()) {
            case 0:
                return part;
            case 1:
                part.front = s;
                return part;
            case 2:
                part.front = Character.toString(s.charAt(0));
                part.end = Character.toString(s.charAt(1));
                return part;
        }

        boolean hasMiddle = s.length() % 2 != 0;
        int midsize = s.length()/2;

        part.front = s.substring(0, midsize);

        if (hasMiddle) {
            part.middle = Character.toString(s.charAt(midsize));
            midsize++;
        }

        part.end = new StringBuilder(s.substring(midsize)).reverse().toString();

        return part;
    }
}