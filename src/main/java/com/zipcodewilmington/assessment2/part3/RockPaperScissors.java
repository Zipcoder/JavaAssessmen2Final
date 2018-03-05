package com.zipcodewilmington.assessment2.part3;

public enum RockPaperScissors{
    ROCK,
    PAPER,
    SCISSORS;

    public RockPaperScissors getWinningSign() {
        RockPaperScissors winner;
        if(name().equals("ROCK")){
            winner = PAPER;
        } else if (name().equals("PAPER")){
            winner = SCISSORS;
        } else {
            winner = ROCK;
        }
        return winner;
    }

    public RockPaperScissors getLosingSign() {
        RockPaperScissors loser;
        if(name().equals("ROCK")){
            loser = SCISSORS;
        } else if (name().equals("PAPER")){
            loser = ROCK;
        } else {
            loser = PAPER;
        }
        return loser;
    }


}
