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

/*  NOTE: all you technically needed for this was your RockPaperScissors class.



option 1:
switch way of doing it :

public enum RockPaperScissors {
    PAPER,
    ROCK,
    SCISSORS;

    public RockPaperScissors getWinner() {
        switch (this) {
            case SCISSORS:
                return ROCK;
            case ROCK:
                return PAPER;
            default:
                return SCISSORS;
        }
    }

    public RockPaperScissors getLoser() {
        return getWinner().getWinner();
    }
}


option2:



leon's enum solution from slack post test:

public enum RockPaperScissors1 {
    PAPER(null),
    ROCK(PAPER),
    SCISSORS(ROCK);

    private final RockPaperScissors1 winner;

    RockPaperScissors1(RockPaperScissors1 winner) {
        this.winner = winner;
    }

    public RockPaperScissors1 getWinner() {
        if(winner == null) {
            return SCISSORS;
        }
        return winner;
    }

    public RockPaperScissors1 getLoser() {
        return getWinner().getWinner();
    }
}

 */



