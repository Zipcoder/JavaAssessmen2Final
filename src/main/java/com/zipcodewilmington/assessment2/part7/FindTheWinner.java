package com.zipcodewilmington.assessment2.part7;

public class FindTheWinner {

    public FindTheWinner() {
    }

    public String winner(Integer[] leon, Integer[] wilhelm, String input) {

        String winnerOrTie = "";
        int leonSumWhenEven = this.leonSumWhenEven(leon);
        int leonSumWhenOdd = this.leonSumWhenOdd(leon);

        int wilhelmSumWheEven = this.wilhelmSumWhenEven(wilhelm);
        int wilhelmSumWhenOdd = this.wilhelmSumWhenOdd(wilhelm);

        int leonScore = 0;
        int wilhelmScore = 0;

        if (input.equals("Even")) {
            leonScore = leonSumWhenEven - wilhelmSumWheEven;
            wilhelmScore = wilhelmSumWheEven - leonSumWhenEven;
        } else if (input.equals("Odd")) {
            leonScore = leonSumWhenOdd - wilhelmSumWhenOdd;
            wilhelmScore = wilhelmSumWhenOdd - leonSumWhenOdd;
        }

        if (leonScore > wilhelmScore) {
            winnerOrTie = "Leon";
        } else if (wilhelmScore > leonScore) {
            winnerOrTie = "Wilhelm";
        } else {
            winnerOrTie = "Tie";
        }

        return winnerOrTie;
    }

    public int leonSumWhenEven(Integer[] leon) {
        int leonSumWhenEven = 0;
        for (int i = 0; i < leon.length; i = i + 2) {
            leonSumWhenEven += leon[i];
        }
        return leonSumWhenEven;
    }

    public int wilhelmSumWhenEven(Integer[] wilhelm) {
        int wilhelmSumWhenEven = 0;
        for (int i = 0; i < wilhelm.length; i = i + 2) {
            wilhelmSumWhenEven += wilhelm[i];
        }
        return wilhelmSumWhenEven;
    }

    public int leonSumWhenOdd(Integer[] leon) {
        int leonSumWhenOdd = 0;
        for (int i = 1; i < leon.length; i = i + 2) {
            leonSumWhenOdd += leon[i];
        }
        return leonSumWhenOdd;
    }

    public int wilhelmSumWhenOdd(Integer[] wilhelm) {
        int wilhelmSumWhenOdd = 0;
        for (int i = 1; i < wilhelm.length; i = i + 2) {
            wilhelmSumWhenOdd += wilhelm[i];
        }
        return wilhelmSumWhenOdd;
    }


}
