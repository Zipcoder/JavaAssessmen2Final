package com.zipcodewilmington.assessment2.part3;

public enum RockPaperScissors {

    ROCK,
    PAPER,
    SCISSORS;

    RockPaperScissors() {

    }

    public RockPaperScissors getWinningSign() {
        switch (this) {
            case ROCK:
                return PAPER;
            case PAPER:
                return SCISSORS;
            case SCISSORS:
                return ROCK;
        }

        return null;
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

        return null;
    }

}
