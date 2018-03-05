package com.zipcodewilmington.assessment2.part7;

public class FindTheWinner {


    public String winner(Integer[] playerOne, Integer[] playerTwo, String flip){
        Integer playerOneScore = 0;
        Integer playerTwoScore = 0;
        String winner = "";
        if(flip.equalsIgnoreCase("Even")) {
            for(int i = 0; i<playerOne.length; i=i+2) {
                playerOneScore += (playerOne[i] - playerTwo[i]);
                playerTwoScore += (playerTwo[i] - playerOne[i]);
            }
        }
        if(flip.equalsIgnoreCase("Odd")) {
            for(int j = 1; j<playerOne.length-1; j=j+2) {
                playerOneScore += (playerOne[j] - playerTwo[j]);
                playerTwoScore += (playerTwo[j] - playerOne[j]);
            }
        }
        if(playerOneScore > playerTwoScore) {
             winner = "Leon";
        }
        if(playerOneScore < playerTwoScore) {
            winner = "Wilhelm";
        }
        return winner;
    }

}
