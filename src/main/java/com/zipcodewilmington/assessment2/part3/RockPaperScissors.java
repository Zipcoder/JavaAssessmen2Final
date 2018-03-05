package com.zipcodewilmington.assessment2.part3;

public enum RockPaperScissors {

    ROCK,
    PAPER,
    SCISSORS;


    public RockPaperScissors getWinningSign(){

        if (this.equals(RockPaperScissors.ROCK)) {
            return RockPaperScissors.PAPER;
        } else if (this.equals(RockPaperScissors.PAPER)) {
            return RockPaperScissors.SCISSORS;
        } else {
            return RockPaperScissors.ROCK;
        }
    }

    public RockPaperScissors getLosingSign(){
       if (this.equals(RockPaperScissors.ROCK)){
           return RockPaperScissors.SCISSORS;
       }
       else if (this.equals(RockPaperScissors.PAPER)){
           return RockPaperScissors.ROCK;
       }
       else{
           return RockPaperScissors.PAPER;
       }
    }




}
