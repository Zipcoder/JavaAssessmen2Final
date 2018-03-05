package com.zipcodewilmington.assessment2.part3;

public enum RockPaperScissors {

        ROCK,
        PAPER,
        SCISSORS;

        private RockPaperScissors input;

        RockPaperScissors(){
            this.input = input;
        }

        RockPaperScissors handsign = input;
    public RockPaperScissors getWinningSign() {

        if (handsign.equals(RockPaperScissors.PAPER)) {
            return RockPaperScissors.SCISSORS;
        } else if (handsign.equals(RockPaperScissors.ROCK)) {
            return RockPaperScissors.ROCK;
        } else if (handsign.equals(RockPaperScissors.SCISSORS)) {
            return RockPaperScissors.ROCK;
        }
        return null;
    }

    public RockPaperScissors getLosingSign() {
        RockPaperScissors handsign = input;
        if (handsign.equals(RockPaperScissors.PAPER)) {
            return RockPaperScissors.SCISSORS;
        } else if (handsign.equals(RockPaperScissors.ROCK)) {
            return RockPaperScissors.ROCK;
        } else if (handsign.equals(RockPaperScissors.SCISSORS)) {
            return RockPaperScissors.ROCK;
        }
        return null;
    }
}

