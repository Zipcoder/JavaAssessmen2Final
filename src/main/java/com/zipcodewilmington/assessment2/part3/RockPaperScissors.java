package com.zipcodewilmington.assessment2.part3;

public enum RockPaperScissors implements Evaluator {
    ROCK,
    PAPER,
    SCISSORS;

    String input;


   RockPaperScissors(){
this.input = input;
   }



        @Override
        public RockPaperScissors getWinningSign () {

        if (ROCK != null){
            return PAPER;}
        else if (SCISSORS != null){
            return ROCK;}
        else if (PAPER != null){
            return SCISSORS;}

        else return null;
        }

        @Override
        public RockPaperScissors getLosingSign () {
            if (ROCK != null){
                return SCISSORS;}
                else if (SCISSORS != null){
                return PAPER;}
            else if (PAPER != null){
                return ROCK;}

            else return null;
        }
}


