package com.zipcodewilmington.assessment2.part3;

public enum RockPaperScissors {

    ROCK,
    PAPER,
    SCISSORS;



    RockPaperScissors() {

    }


    public RockPaperScissors getWinningSign() {

        RockPaperScissors input = RockPaperScissors.ROCK;

        switch (input) {

            case ROCK:
                return PAPER;

            case SCISSORS:
                return ROCK;

            case PAPER:
                return SCISSORS;

            default:
                break;


//        if (input.equals(ROCK))
//            return RockPaperScissors.PAPER;
//        else if (input.equals(PAPER))
//            return RockPaperScissors.SCISSORS;
//         else if (input.equals(SCISSORS))
//            return RockPaperScissors.ROCK;
//
//
//        return null;
        }
        return ROCK;
    }

    public RockPaperScissors getLosingSign() {

        RockPaperScissors input = RockPaperScissors.PAPER;

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

