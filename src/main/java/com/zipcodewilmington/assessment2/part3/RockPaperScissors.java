package com.zipcodewilmington.assessment2.part3;

public enum RockPaperScissors implements Evaluator {
    //(winningMove, loosingMOve)
    ROCK("Scissors", "Paper"), PAPER("Rock", "Scissors" ), SCISSORS("Paper","Rock");

    private  String winningMove;
    private final String loosingMove;

    RockPaperScissors(String winningMove, String loosingMove) {
        this.winningMove = winningMove;
        this.loosingMove = loosingMove;
    }

    public String getWinningSign() {

        return winningMove;
    }

    public String getLosingSign() {
        return loosingMove;
    }

    public void evaluateWinnerTest(){

    }


    public void evaluateLoserTest() {
    }
}


    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players

    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        if(handSignOfPlayer1.equals(handSignOfPlayer2)) {
            return "Tied!";
        } else if(RockPaperSissorsEvaluator.getLosingMove(handSignOfPlayer1) == handSignOfPlayer2){
            return handSignOfPlayer2;
        } else {
            return handSignOfPlayer1; }
    }
}*/