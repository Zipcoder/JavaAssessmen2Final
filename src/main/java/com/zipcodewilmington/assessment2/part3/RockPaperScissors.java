package com.zipcodewilmington.assessment2.part3;

public enum RockPaperScissors {
    ROCK("Paper", "Scissors"),
    PAPER("Scissors", "Rock" ),
    SCISSORS("Rock", "Paper"),
    ;

    private String winningSign;
    private String losingSign;


    RockPaperScissors(String winningSign, String losingSign) {
        this.winningSign = winningSign;
        this.losingSign = losingSign;
    }

    public RockPaperScissors findWinningSign(RockPaperScissors input) {
        switch (input) {
            case ROCK:
                return RockPaperScissors.PAPER;
            case PAPER:
                return RockPaperScissors.SCISSORS;
            case SCISSORS:
                return RockPaperScissors.ROCK;
        }
        return null;
    }

    public RockPaperScissors findLosingSign(RockPaperScissors input) {
        switch (input) {
            case ROCK:
                return RockPaperScissors.SCISSORS;
            case PAPER:
                return RockPaperScissors.ROCK;
            case SCISSORS:
                return RockPaperScissors.PAPER;
        }
        return null;
    }

    public RockPaperScissors getWinningSign() {
        return findWinningSign(RockPaperScissors.ROCK);

    }
    public RockPaperScissors getLosingSign() {
        return findLosingSign(RockPaperScissors.ROCK);
    }


}
