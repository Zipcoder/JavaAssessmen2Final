package com.zipcodewilmington.assessment2.part3;

import static com.zipcodewilmington.assessment2.part3.RockPaperScissors.PAPER;
import static com.zipcodewilmington.assessment2.part3.RockPaperScissors.ROCK;
import static com.zipcodewilmington.assessment2.part3.RockPaperScissors.SCISSORS;

public class RockEvaluator implements Evaluator {

    @Override
    public RockPaperScissors getWinningSign() {

        if (ROCK != null) {
            return PAPER;
        }
        return null;
    }

    @Override
    public RockPaperScissors getLosingSign() {
        if (ROCK != null) {
            return SCISSORS;
        }
        return null;
    }
}

