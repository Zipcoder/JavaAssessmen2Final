package com.zipcodewilmington.assessment2.part3;

public class RockPaperScissors {

    protected static final RockPaperScissors ROCK = new RockPaperScissors();
    protected static final RockPaperScissors PAPER = new RockPaperScissors();
    protected static final RockPaperScissors SCISSORS = new RockPaperScissors();

    public RockPaperScissors getWinningSign() {
            RockPaperScissors input = new RockPaperScissors();
            if (input.equals(PAPER)) {
                return SCISSORS;
            } else if (input.equals(ROCK)) {
                return PAPER;
            } else {
                return input.equals(SCISSORS) ? ROCK : null;
            }
        }

        public RockPaperScissors getLosingSign() {
            RockPaperScissors input = new RockPaperScissors();
            if (input.equals(PAPER)) {
                return SCISSORS;
            } else if (input.equals(ROCK)) {
                return PAPER;
            } else {
                return input.equals(SCISSORS) ? ROCK : null;
            }
        }
    }

