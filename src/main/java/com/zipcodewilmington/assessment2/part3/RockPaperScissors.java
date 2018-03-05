package com.zipcodewilmington.assessment2.part3;

public enum RockPaperScissors {

    ROCK("ROCK"),
    PAPER("PAPER"),
    SCISSORS("SCISSORS");

    private String sign;

    RockPaperScissors(String sign)
    {
        this.sign = sign;
    }

    public RockPaperScissors getWinningSign()
    {
        if (sign.equals(RockPaperScissors.ROCK))
        {
            return RockPaperScissors.PAPER;
        }

        else if (sign.equals(RockPaperScissors.SCISSORS))
        {
            return RockPaperScissors.SCISSORS;
        }
        else {
            return RockPaperScissors.PAPER;
        }




    }

    public RockPaperScissors getLosingSign()
    {
        if (sign.equals(RockPaperScissors.SCISSORS))
        {
            return RockPaperScissors.ROCK;
        }

        else if (sign.equals(RockPaperScissors.ROCK))
        {
            return RockPaperScissors.PAPER;
        }
        else
        {
            return RockPaperScissors.SCISSORS;
        }

    }




}
