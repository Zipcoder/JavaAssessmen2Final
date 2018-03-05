package com.zipcodewilmington.assessment2.part3;

enum RockPaperScissors {
    ROCK, PAPER, SCISSORS//enum constants used globally across all the classes

    public boolean canBeatRock(){
        return RockPaperScissors.PAPER.canBeatRock();
    }
    public boolean canBeatPaper() {
        return RockPaperScissors.SCISSORS.canBeatPaper();
    }

    public boolean canBeatScissors(){
        return RockPaperScissors.ROCK.canBeatScissors();
    }
    public RockPaperScissors getWinningSign() {
        if (this.equals(PAPER)) {
            return SCISSORS;
        } else if (this.equals(ROCK)) {
            return PAPER;
        } else {
            return this.equals(SCISSORS) ? ROCK : this;
        }
    }

        public RockPaperScissors getLosingSign () {
            if (this.equals(SCISSORS)) {
                return ROCK;
            } else if (this.equals(PAPER)) {
                return SCISSORS;
            } else {
                return this.equals(PAPER) ? SCISSORS : this;
            }
        }
    }