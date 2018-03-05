package com.zipcodewilmington.assessment2.part3;

public enum RockPaperScissors {
    ROCK,
    PAPER,
    SCISSORS;

    public RockPaperScissors getWinningSign(){
        RockPaperScissors winner = RockPaperScissors.SCISSORS;
        if(winner.equals(RockPaperScissors.ROCK)){
            winner= RockPaperScissors.PAPER;
        }else if(winner.equals(RockPaperScissors.SCISSORS)){
            winner = RockPaperScissors.ROCK;
        }else{
            winner = RockPaperScissors.SCISSORS;
        }
        return winner;
    }

    public RockPaperScissors getLosingSign(){
        RockPaperScissors loser= RockPaperScissors.ROCK;
        if (loser.equals(RockPaperScissors.ROCK)) {
            loser = RockPaperScissors.SCISSORS;
        } else if (loser.equals(RockPaperScissors.SCISSORS)) {
            loser = RockPaperScissors.PAPER;
        } else
            loser = RockPaperScissors.ROCK;

        return loser;
    }

}
