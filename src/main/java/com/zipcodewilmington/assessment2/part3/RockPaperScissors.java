package com.zipcodewilmington.assessment2.part3;

public enum RockPaperScissors {
    SCISSORS, ROCK, PAPER;


    public RockPaperScissors getWinningSign(){
        if (this == ROCK){
         return RockPaperScissors.PAPER;
        } else if (this == PAPER){
            return RockPaperScissors.SCISSORS;
        } else if (this == SCISSORS){
            return RockPaperScissors.ROCK;
        }
        return null;
    }

    public RockPaperScissors getLosingSign(){
        if (this == ROCK){
            return RockPaperScissors.SCISSORS;
        } else if (this == PAPER){
            return RockPaperScissors.ROCK;
        } else if (this == SCISSORS){
            return RockPaperScissors.PAPER;
        }
        return null;
    }
}
