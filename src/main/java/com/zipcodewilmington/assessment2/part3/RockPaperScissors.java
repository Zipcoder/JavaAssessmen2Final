package com.zipcodewilmington.assessment2.part3;

public enum RockPaperScissors {

    ROCK("paper"),
    PAPER("scissors"),
    SCISSORS("rock");

    final String winningSign;

    RockPaperScissors(String winningSign) {
        this.winningSign = winningSign;
    }

    public String getWinningSignAsString() {
        return this.winningSign;
    }

    public RockPaperScissors getWinningSign() {
        if (getWinningSignAsString().equals("paper")) {
            return this.PAPER;
        } else if (getWinningSignAsString().equals("scissors")) {
            return this.SCISSORS;
        } else {
            return this.ROCK;
        }
    }

    public RockPaperScissors getLosingSign() {
        if (getWinningSignAsString().equals("paper")) {
            return this.SCISSORS;
        } else if (getWinningSignAsString().equals("scissors")) {
            return this.ROCK;
        } else {
            return this.PAPER;
        }
    }

}
