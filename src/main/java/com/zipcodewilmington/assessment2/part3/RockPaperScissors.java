package com.zipcodewilmington.assessment2.part3;

public enum RockPaperScissors {

    ROCK,
    PAPER,
    SCISSORS;



    public RockPaperScissors getWinningSign() {

        RockPaperScissors input = RockPaperScissors.values()[0];

        switch (input) {

            case ROCK:
                return PAPER;

            case SCISSORS:
                return ROCK;

            case PAPER:
                return SCISSORS;

            default:
                break;



        }
        return ROCK;
    }

    public RockPaperScissors getLosingSign() {

        RockPaperScissors input = RockPaperScissors.ROCK;

        switch (input) {

            case ROCK:
                return SCISSORS;


            case SCISSORS:
                return PAPER;

            case PAPER:
                return ROCK;

            default:
                break;

        }
        return null;
    }
}

