package com.zipcodewilmington.assessment2.part7;

public class FindTheWinner {

    public String winner(Integer[] leon, Integer[] wilhem, String input) {

        Integer player1Score = 0;
        Integer player2Score = 0;

//        int i = (input.equalsIgnoreCase("Even") ? 0:1);

        for (int i = (input.equalsIgnoreCase("Even") ? 0:1); i <leon.length; i+=2){
            player1Score += leon[i]-wilhem[i];
            player2Score += wilhem[i]-leon[i];

        }

       String winner = player1Score > player2Score ? "Leon": "Wilhelm";


        return winner;

    }
}

/*here is what amy ended up with on test day:

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

 */

/*

 */
