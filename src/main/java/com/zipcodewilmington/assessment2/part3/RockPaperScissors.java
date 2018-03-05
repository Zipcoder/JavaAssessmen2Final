package com.zipcodewilmington.assessment2.part3;

import java.awt.print.Paper;

public enum RockPaperScissors {

    ROCK(1),
    PAPER(2),
    SCISSORS(3);
    public final int compareThese;

    RockPaperScissors(int compareThese){
        this.compareThese =compareThese;
    }

    public RockPaperScissors getWinningSign(){
        if (compareThese == 1){
            return PAPER;
        }
        if (compareThese == 2){
            return SCISSORS;
        }
        if (RockPaperScissors.SCISSORS.equals(SCISSORS)){
            return ROCK;
        }
        return null;
    }
    public RockPaperScissors getLosingSign(){
        if (compareThese == 1){
            return SCISSORS;
        }
        if (compareThese == 2){
            return ROCK;
        }
        if (RockPaperScissors.SCISSORS.equals(SCISSORS)){
            return PAPER;
        }
        return null;
    }
}
