package com.zipcodewilmington.assessment2.part3;

import sun.jvm.hotspot.ui.tree.RootTreeNodeAdapter;

public enum RockPaperScissors {

    ROCK("rock"),
    PAPER("paper"),
    SCISSORS("scissors");

    final String input;

    RockPaperScissors(String rockPaperScissors) {
        this.input = rockPaperScissors;
    }

    public RockPaperScissors getWinningSign() {
        if (input.equals("rock")) {
            return RockPaperScissors.PAPER;
        } else if (input.equals("paper")){
            return RockPaperScissors.SCISSORS;
        } else {
            return RockPaperScissors.ROCK;
        }
    }

    public RockPaperScissors getLosingSign() {
        if (input.equals("rock")) {
            return RockPaperScissors.SCISSORS;
        } else if (input.equals("paper")){
            return RockPaperScissors.ROCK;
        } else {
            return RockPaperScissors.PAPER;
        }    }

}
