package com.zipcodewilmington.assessment2.part3;

import java.util.Scanner;

public enum RockPaperScissors {
    ROCK, PAPER, SCISSORS;



    public RockPaperScissors getWinningSign(){
        if (name().equals("SCISSORS")) return ROCK;
        else if (name().equals("PAPER")) return SCISSORS;
        else if (name().equals("ROCK")) return PAPER;
        else return null;
    }

    public RockPaperScissors getLosingSign() {
        if (name().equals("SCISSORS")) return PAPER;
        else if (name().equals("PAPER")) return ROCK;
        else if (name().equals("ROCK")) return SCISSORS;
        else return null;
    }
}
