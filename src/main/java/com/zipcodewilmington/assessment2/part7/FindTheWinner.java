package com.zipcodewilmington.assessment2.part7;

public class FindTheWinner {
    private Integer[] scorbored;

    public FindTheWinner() {
        scorbored = new Integer[2];
        scorbored[0] = 0;
        scorbored[1] = 1;
    }

    public String winner(Integer[] player1, Integer[] player2, String input) {
        int player1Index = 0;
        int player2Index = 1;

        for (int i = 0; i < player1.length; i += 2) {
            if (i == 0 && input.equalsIgnoreCase("Even")) {
                //updates score for player1
                calculateRoundScore(player1[i], player2[i], player1Index);
                //updates score for player2
                calculateRoundScore(player2[i], player1[i], player2Index);
            } else if (i == 0 && input.equalsIgnoreCase("Odd")) {
                //skip to next card
                i = 1;
                // flips the next and updates scores;
                //updates score for player1
                calculateRoundScore(player1[i], player2[i], player1Index);
                //updates score for player2
                calculateRoundScore(player2[i], player1[i], player2Index);
            } else {
                //updates score for player1
                calculateRoundScore(player1[i], player2[i], player1Index);
                //updates score for player2
                calculateRoundScore(player2[i], player1[i], player2Index);
            }

        }

        return getWinner();
    }

    public String getWinner() {
        String winner = " ";
        if (scorbored[0] > scorbored[1]) {
            winner = "Leon";
        } else if (scorbored[0] < scorbored[1]) {
            winner = "Wilhelm";
        } else {
            winner = "Tie";
        }
        return winner;
    }

    //public Integer   flip(Integer)
    // calculates the score one player at a time
    public void calculateRoundScore(Integer currentPlayerScore, Integer score2, int currentPlayerIndex) {
        Integer roundScore = currentPlayerScore - score2;
        updateScore(roundScore, currentPlayerIndex);
    }


    // updates score for single player
    public void updateScore(Integer updateScore, int currentPlayerIndex) {
        scorbored[currentPlayerIndex] += updateScore;
    }

    //get score of a single player
    public Integer getScore(int index) {
        return scorbored[index];
    }

    //score for both players.
    public Integer[] getScoreBored(int index) {
        return this.scorbored;
    }

}
