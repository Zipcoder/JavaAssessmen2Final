package com.zipcodewilmington.assessment2.part7;

public class FindTheWinner {

    private String winner = "";

    public FindTheWinner(){

    }
    public String winner(Integer[] player1, Integer[] player2, String input) {

        if (input.equalsIgnoreCase("Even")){
            // If "Even" is called, the player's top cards are flipped so they can see the face value.

        } else if (input.equalsIgnoreCase("Odd")){
            //If instead "Odd" is called, the top card is removed from each deck and discarded, then each flips her next card.

        } else {
            winner = "ERROR: We're sorry- you entered an invalid entry type. Please try again.";
        }

        return winner;

    }
}
