package com.zipcodewilmington.assessment2.part3;

public enum RockPaperScissors {
    PAPER, SCISSORS, ROCK;

    public RockPaperScissors getWinningSign() {
        switch (this) {
            case ROCK:
                return PAPER;
            case PAPER:
                return SCISSORS;
            case SCISSORS:
                return ROCK;
        }
        return this;
    }

    public RockPaperScissors getLosingSign() {
        switch (this) {
            case ROCK:
                return SCISSORS;
            case PAPER:
                return ROCK;
            case SCISSORS:
                return PAPER;
        }

        return this;
    }
}


/**
 * @param handSignOfPlayer1 a string representative of a hand sign of a player
 * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
 * @return a string representative of the winning hand sign between the two players
 * <p>
 * public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
 * if(handSignOfPlayer1.equals(handSignOfPlayer2)) {
 * return "Tied!";
 * } else if(RockPaperSissorsEvaluator.getLosingMove(handSignOfPlayer1) == handSignOfPlayer2){
 * return handSignOfPlayer2;
 * } else {
 * return handSignOfPlayer1; }
 * }
 * }
 */