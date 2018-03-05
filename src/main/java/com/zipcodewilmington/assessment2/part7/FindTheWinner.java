package com.zipcodewilmington.assessment2.part7;

public class FindTheWinner {

    public static final String EVEN = "Even";
    public static final String ODD = "Odd";
    public static final String PLAYER1NAME = "Leon";
    public static final String PLAYER2NAME = "Wilhelm";
//Did players call odd or even
    private static boolean isEven(String input) {
        return input.equals(EVEN);
    }

    private static boolean isOdd(String input) {
        return input.equals(ODD);
    }
//if player calls even, check values of card at index 0 and index 2
    // calculate player1 score
    //calculate player2 score
    //if player1 score larger return player1name
    //if player2 score larger return player2name
    //if score equal return tie
    private static String doEven(Integer[] player1, Integer[] player2) {
        Integer p1Score = (player1[0] - player2[0]) + (player1[2] - player2[2]);
        Integer p2Score = (player2[0] - player1[0]) + (player2[2] - player1[2]);

        if (p1Score > p2Score) {
            return PLAYER1NAME;
        } else if (p2Score > p1Score) {
            return PLAYER2NAME;
        }

        return "tie";
    }
    //if player calls odd, check values of card at index 1
    // calculate player1 score
    //calculate player2 score
    //if player1 score larger return player1name
    //if player2 score larger return player2name
    //if score equal return tie
    private static String doOdd(Integer[] player1, Integer[] player2) {
        Integer p1Score = player1[1] - player2[1];
        Integer p2Score = player2[1] - player1[1];

        if (p1Score > p2Score) {
            return PLAYER1NAME;
        } else if (p2Score > p1Score) {
            return PLAYER2NAME;
        }

        return "tie";
    }
//now enter array for each player and whether or not should call even or odd
    //if input is even call doEven, if input is odd call doOdd,
    public String winner(Integer[] player1, Integer[] player2, String input) {
        if (isEven(input)) {
            return doEven(player1, player2);
        } else if (isOdd(input)) {
            return doOdd(player1, player2);
        }

        return "NOBODY";
    }
}
