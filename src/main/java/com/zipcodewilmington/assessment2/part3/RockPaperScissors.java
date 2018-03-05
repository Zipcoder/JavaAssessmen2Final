package com.zipcodewilmington.assessment2.part3;

/**
 * filename:
 * project: question1
 * author: https://github.com/vvmk
 * date: 3/5/18
 */
enum RockPaperScissors {
    ROCK("scissors", "paper"),
    PAPER("rock", "scissors"),
    SCISSORS("paper", "rock");

    String beats;
    String losesTo;

    RockPaperScissors(String beats, String losesTo) {
        this.beats = beats;
        this.losesTo = losesTo;
    }

    public RockPaperScissors getWinningSign() {
        return RockPaperScissors.getByString(this.losesTo);
    }

    public RockPaperScissors getLosingSign() {
        return RockPaperScissors.getByString(this.beats);
    }

    private static RockPaperScissors getByString(String sign) {
        for (RockPaperScissors rps : RockPaperScissors.values()) {
            if (rps.toString().equalsIgnoreCase(sign))
                return rps;
        }
        return null;
    }
}
