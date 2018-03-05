package com.zipcodewilmington.assessment2.part3;

public enum RockPaperScissorsEnum {
    ROCK, PAPER, SCISSORS; //enums

    public String getWinningMove(String input) { //get the winning move for each possible scenario
            if (input.equals(PAPER)) {
                return SCISSORS;
            } else if (input.equals(ROCK)) {
                return PAPER;
            } else if (input.equals(SCISSORS)) {
                return ROCK;
            }
            return "Error in Argument";
        }

        public boolean

    }
