package com.zipcodewilmington.assessment2.part3;

public enum RockPaperScissors {

    ROCK(RockPaperScissors.PAPER, RockPaperScissors.SCISSORS),
    PAPER(RockPaperScissors.SCISSORS, RockPaperScissors.ROCK),
    SCISSORS(RockPaperScissors.ROCK, RockPaperScissors.PAPER);

    RockPaperScissors winningSign;
    RockPaperScissors losingSign;

    RockPaperScissors(RockPaperScissors winningSign, RockPaperScissors losingSign){
        this.winningSign = winningSign;
        this.losingSign = losingSign;
    }

    public RockPaperScissors getWinningSign(){
        return this.winningSign;
    }

    public RockPaperScissors getLosingSign(){
        return this.losingSign;
    }




}
