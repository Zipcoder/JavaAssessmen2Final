package com.zipcodewilmington.assessment2.part3;

public enum RockPaperScissors {
    ROCK("rock"),
    PAPER("paper"),
    SCISSORS("scissors");

    public String move;


    RockPaperScissors(String move) {
        this.move = move;
    }

    public RockPaperScissors getWinningSign() {
        return getRockPaperScissors(PAPER, SCISSORS, ROCK);
    }

    private RockPaperScissors getRockPaperScissors(RockPaperScissors paper, RockPaperScissors scissors, RockPaperScissors rock) {
        switch (move) {
            case "rock":
                return paper;
            case "paper":
                return scissors;
            case "scissors":
                return rock;
            default:
                return null;
        }
    }

    public RockPaperScissors getLosingSign() {
        return getRockPaperScissors(SCISSORS, ROCK, PAPER);
    }
}

