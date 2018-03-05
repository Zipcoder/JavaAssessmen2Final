package com.zipcodewilmington.assessment2.part3;

import static com.zipcodewilmington.assessment2.part3.RockPaperScissors.PAPER;
import static com.zipcodewilmington.assessment2.part3.RockPaperScissors.ROCK;
import static com.zipcodewilmington.assessment2.part3.RockPaperScissors.SCISSORS;

public class ScissorEvaluator implements Evaluator {


    @Override
    public RockPaperScissors getWinningSign() {

        if (SCISSORS != null) {
            return ROCK;
        }
        return null;
    }

    @Override
    public RockPaperScissors getLosingSign() {
        if (SCISSORS != null) {
            return PAPER;
        }
        return null;
    }
}


