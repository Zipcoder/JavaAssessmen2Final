package com.zipcodewilmington.assessment2.part3;

import java.awt.print.Paper;

public enum RockPaperScissors {

    ROCK,
    PAPER,
    SCISSORS;

    public RockPaperScissors getWinningSign(){
        if (ROCK.equals(RockPaperScissors.ROCK)){
            return PAPER;
        }
        if (PAPER.equals(RockPaperScissors.PAPER)){
            return SCISSORS;
        }
        if (RockPaperScissors.SCISSORS.equals(SCISSORS)){
            return ROCK;
        }
        return null;
    }
    public RockPaperScissors getLosingSign(){
        if (RockPaperScissors.ROCK.equals(ROCK)){
            return SCISSORS;
        }
        if (RockPaperScissors.PAPER.equals(PAPER)){
            return ROCK;
        }
        if (RockPaperScissors.SCISSORS.equals(SCISSORS)){
            return PAPER;
        }
        return null;
    }
}
