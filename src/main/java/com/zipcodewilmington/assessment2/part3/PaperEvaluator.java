package com.zipcodewilmington.assessment2.part3;

import static com.zipcodewilmington.assessment2.part3.RockPaperScissors.PAPER;
import static com.zipcodewilmington.assessment2.part3.RockPaperScissors.ROCK;
import static com.zipcodewilmington.assessment2.part3.RockPaperScissors.SCISSORS;

public class PaperEvaluator implements Evaluator {


    @Override
    public RockPaperScissors getWinningSign() {

        if (PAPER!= null) {
            return SCISSORS;
        }
        return null;
    }

    @Override
    public RockPaperScissors getLosingSign() {
        if (PAPER != null) {
            return ROCK;
        }
        return null;
    }
}