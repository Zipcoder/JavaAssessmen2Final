package com.zipcodewilmington.assessment2.part3;

public enum RockPaperScissors {

    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors");

    String sign;

    RockPaperScissors(String sign){
        this.sign = sign;
    }


    public RockPaperScissors getWinningSign(){
        if (this.sign.equals("Rock")) {
            return RockPaperScissors.PAPER;
        } else if (this.sign.equals("Paper")) {
            return RockPaperScissors.SCISSORS;
        } else if (this.sign.equals("Scissors")) {
            return RockPaperScissors.ROCK;
        }
         return null;
    }

    public RockPaperScissors getLosingSign(){
        if (this.sign.equals("Rock")) {
            return RockPaperScissors.SCISSORS;
        } else if (this.sign.equals("Paper")) {
            return RockPaperScissors.ROCK;
        } else if (this.sign.equals("Scissors")) {
            return RockPaperScissors.PAPER;
        }
        return null;
    }

    public void playRock(RockPaperScissors input){

    }
}
