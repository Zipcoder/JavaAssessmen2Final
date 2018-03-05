package com.zipcodewilmington.assessment2.part3;

public enum RockPaperScissors {
<<<<<<< HEAD

    ROCK,
    PAPER,
    SCISSORS;


    public RockPaperScissors getWinningSign() {
        if (this.equals(PAPER)) {
            return SCISSORS;
        } else if (this.equals(ROCK)) {
            return PAPER;
        } else if (this.equals(SCISSORS)) {
            return ROCK;
        }
        return this;
    }

    public RockPaperScissors getLosingSign() {
        if (this.equals(PAPER)) {
            return ROCK;
        } else if (this.equals(ROCK)) {
            return SCISSORS;
        } else if (this.equals(SCISSORS)) {
            return PAPER;
        }
        return this;
    }
}
=======
}
>>>>>>> part4
