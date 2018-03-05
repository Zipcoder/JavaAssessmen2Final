package com.zipcodewilmington.assessment2.part3;

public enum Input {
    ROCK,PAPER,SCISSORS;//enum constants

    protected static final RockPaperScissors input = new RockPaperScissors();//input object

    Input() {
    }

    public boolean beatsRock() { //only paper can beat rock
        return !input.equals(SCISSORS) && input.equals(PAPER);
    }

    public boolean beatsPaper() { //only scissors can beat paper
        return !input.equals(ROCK) && input.equals(SCISSORS);
    }

    public boolean beatScissors() { //only rock can beat scissors
        return !input.equals(PAPER) && input.equals(ROCK);
    }
}