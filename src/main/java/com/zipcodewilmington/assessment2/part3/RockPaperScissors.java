package com.zipcodewilmington.assessment2.part3;

public enum RockPaperScissors {

    ROCK,
    SCISSORS,
    PAPER;

    RockPaperScissors() {

    }

    public RockPaperScissors getWinningSign() {
        if (this.equals(ROCK)) {
            return PAPER;
        } else if (this.equals(PAPER)) {
            return SCISSORS;
        } else if (this.equals(SCISSORS)) {
            return ROCK;
        }
        return null;
    }

    public RockPaperScissors getLosingSign() {
        if (this.equals(ROCK)) {
            return SCISSORS;
        } else if (this.equals(PAPER)) {
            return ROCK;
        } else if (this.equals(SCISSORS)) {
            return PAPER;
        }
        return null;
    }

}
