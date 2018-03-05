package com.zipcodewilmington.assessment2.part7;

public class FindTheWinner {


    public FindTheWinner() {

    }


    public String winner(Integer[] leon, Integer[] wilhem, String s) {

        if (s.equalsIgnoreCase("Even")) {
            return winnerIfEven(leon, wilhem);
        } else return winnerIfOdd(leon, wilhem);
    }


    private String winnerIfEven(Integer[] leon, Integer[] wilhem) {

        int leonScore = 0;

        for (int i = 0; i < leon.length; i = i + 2) {
            leonScore += (leon[i] - wilhem[i]);
        }

        if (leonScore > 0) {
            return "Leon";
        } else return "Wilhelm";

    }

    private String winnerIfOdd(Integer[] leon, Integer[] wilhem) {

        int leonScore = 0;

        for (int i = 1; i < leon.length; i = i + 2) {
            leonScore += (leon[i] - wilhem[i]);
        }

        if (leonScore > 0) {
            return "Leon";
        } else return "Wilhelm";

    }


}
