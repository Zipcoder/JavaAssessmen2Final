package com.zipcodewilmington.assessment2.part3;

public enum RockPaperScissors {
    ROCK,
    PAPER,
    SCISSORS;

    public RockPaperScissors rockPaperScissors;

    RockPaperScissors(){

    }
    public RockPaperScissors getWinningSign(){
        if(ROCK.equals(this.rockPaperScissors)){
            return PAPER;
        }
        if(PAPER.equals(this.rockPaperScissors)){
            return SCISSORS;
        }
        if(SCISSORS.equals(rockPaperScissors)){
            return ROCK;
        }
        return rockPaperScissors;
    }
    public RockPaperScissors getLosingSign(){
        if(ROCK.equals(rockPaperScissors)){
            return SCISSORS;
        }
        if(PAPER.equals(rockPaperScissors)){
            return ROCK;
        }
        if(SCISSORS.equals(rockPaperScissors)){
            return PAPER;
        }
        return rockPaperScissors;
    }
}
