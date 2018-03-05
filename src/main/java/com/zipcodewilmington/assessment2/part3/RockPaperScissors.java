package com.zipcodewilmington.assessment2.part3;

public enum RockPaperScissors {
    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors");

    private String sign;

    RockPaperScissors(String sign){
        this.sign = sign;
    }

    public RockPaperScissors getWinningSign(){
        if (sign.equals("Rock")){
            return PAPER;
        } else if (sign.equals("Paper")){
            return SCISSORS;
        } else if (sign.equals("Scissors")){
            return ROCK;
        }
        return null;
    }

    public RockPaperScissors getLosingSign() {
        if (sign.equals("Rock")){
            return SCISSORS;
        } else if (sign.equals("Paper")){
            return ROCK;
        } else if (sign.equals("Scissors")){
            return PAPER;
        }
        return null;


    }
}
