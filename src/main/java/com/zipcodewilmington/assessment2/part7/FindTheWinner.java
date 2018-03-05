package com.zipcodewilmington.assessment2.part7;

public class FindTheWinner {

    Integer[] intArray;

    public int findOddorEvenIndex(String input) {
        int index = 0;
        if (input.equalsIgnoreCase("Even")) {
            for (int i = 0; i < intArray.length; i++) {
                if (i % 2 == 0) {
                    index = intArray[i];
                }

                    index = intArray[i - 1];
            }
        }
        return index;
    }

    public String winner(Integer[] leon, Integer[] wilhelm, String input) {
        int wilhelmScore = 0;
        int leonScore = 0;
        int index = findOddorEvenIndex(input);
        for (int i = 0; i < leon.length; i++) {
            if (leon[index] > wilhelm[index]) {
                leonScore++;
            }
            wilhelmScore++;
        }if(leonScore > wilhelmScore) {
            return "Leon";
        }else if (wilhelmScore > leonScore) {
            return "Wilhelm";
        }
        return "tie";
    }
}
