package com.zipcodewilmington.assessment2.part7;

public class FindTheWinner {

    public String winner(Integer[] leonsNumbers, Integer[] wilhelmsNumbers, String evenOrOdd){
        if (evenOrOdd.equals("Even")){
            return game(leonsNumbers, wilhelmsNumbers, 0);
        } else{
            return game(leonsNumbers, wilhelmsNumbers, 1);
        }
    }

    private String game(Integer[] leonsNumbers, Integer[] wilhelmsNumbers, int startingValue){
        int leonsScore = 0;
        int wilhelmsScore = 0;
        for (int i = startingValue; i < leonsNumbers.length; i += 2){
            leonsScore += leonsNumbers[i] - wilhelmsNumbers[i];
            wilhelmsScore += wilhelmsNumbers[i] - leonsNumbers[i];

        }
        if (leonsScore > wilhelmsScore){
            return "Leon";
        } else if (wilhelmsScore > leonsScore){
            return "Wilhelm";
        } else {
            return "Tie";
        }
    }

}
