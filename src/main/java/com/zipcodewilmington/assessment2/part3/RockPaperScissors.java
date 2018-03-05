package com.zipcodewilmington.assessment2.part3;

public enum RockPaperScissors {

    ROCK(),
    PAPER(),
    SCISSORS();


    RockPaperScissors() {

    }

    public RockPaperScissors getWinningSign(){
        if (RockPaperScissors.SCISSORS.equals(RockPaperScissors.ROCK)){
            return ROCK;
        }
        if (RockPaperScissors.ROCK.equals(RockPaperScissors.PAPER)) {
            return PAPER;
        }
        //if (RockPaperScissors.PAPER.equals(RockPaperScissors.SCISSORS)) {
            return PAPER;
    }

    public RockPaperScissors getLosingSign (){
        if (RockPaperScissors.SCISSORS.equals(RockPaperScissors.ROCK)){
            return SCISSORS;
        }
        if (RockPaperScissors.ROCK.equals(RockPaperScissors.PAPER)) {
            return ROCK;
        }
       // if (RockPaperScissors.PAPER.equals(RockPaperScissors.SCISSORS)) {
           // return SCISSORS;
        return SCISSORS;
    }
}
