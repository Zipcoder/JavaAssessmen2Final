package com.zipcodewilmington.assessment2.part7;

public class FindTheWinner {

    Integer[] intArray;

    public String winner(Integer[] leon, Integer[] wilhelm, String input) {
        int wilhelmScore = 0;
        int leonScore = 0;
        int index = 0;
        intArray = new Integer[(leon.length + 1)];

        if( input.equalsIgnoreCase("Odd")) {
            index = 1;
        }
        for(int i = 0; i < leon.length; i+=2) {
            if (leon[i] > wilhelm[i]) {
                leonScore = leon[i] - wilhelm[i];
            } else if (wilhelm[i] > leon[i]) {
                wilhelmScore = wilhelm[index] - leon [index];
            }
        }if(leonScore > wilhelmScore) {
            return "Leon";
        }else if (wilhelmScore > leonScore) {
            return "Wilhelm";
        }
        return "Tie";
    }
}
