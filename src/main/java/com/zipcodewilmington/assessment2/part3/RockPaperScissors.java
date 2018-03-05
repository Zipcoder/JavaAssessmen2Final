package com.zipcodewilmington.assessment2.part3;

public enum RockPaperScissors {
    ROCK,
    PAPER,
    SCISSORS;

    RockPaperScissors(){

    }

    public RockPaperScissors getWinningSign(){
        RockPaperScissors winner = null;
        if(this.equals(ROCK)) {
            winner = PAPER;
        } else if (this.equals(PAPER)) {
            winner = SCISSORS;
        } else if (this.equals(SCISSORS)){
            winner = ROCK;
        }
        return winner;
    }

    public RockPaperScissors getLosingSign(){
        RockPaperScissors loser = null;
        if(this.equals(ROCK)) {
            loser = SCISSORS;
        } else if (this.equals(PAPER)) {
            loser = ROCK;
        } else if (this.equals(SCISSORS)){
            loser = PAPER;
        }
        return loser;
    }
}
