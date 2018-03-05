package com.zipcodewilmington.assessment2.part3;

public enum RockPaperScissors {

    ROCK,
    PAPER,
    SCISSORS,;


    public RockPaperScissors getWinningSign() {
        if (ROCK != PAPER) {
            return PAPER;
        }
        if (PAPER != SCISSORS) {
            return SCISSORS;
        }
        if (SCISSORS != ROCK) {
            return ROCK;
        }
        return null;
    }


    public RockPaperScissors getLosingSign() {
        if(ROCK != SCISSORS){
            return SCISSORS;
        }
        if(SCISSORS != PAPER){
            return PAPER;
        }
        return null;
    }
}
