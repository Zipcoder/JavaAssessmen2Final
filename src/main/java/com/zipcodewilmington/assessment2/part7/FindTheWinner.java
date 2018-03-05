package com.zipcodewilmington.assessment2.part7;

public class FindTheWinner {

    private int leonScore;
    private int wilhelmScore;

    public String winner (Integer[] leon, Integer[] wilhelm, String oddOrEven){
        if(oddOrEven.equalsIgnoreCase("even")){
            this.playGame(leon,wilhelm,0);
        }
        else{
            this.playGame(leon,wilhelm,1);
        }
        if (leonScore > wilhelmScore){
            return "Leon";
        }
        else if (wilhelmScore > leonScore){
            return "Wilhelm";
        }
        else{return "tie";}

    }

    public void takeTurn(Integer[] leon, Integer[] wilhelm, int turnNumber){
        this.leonScore += leon[turnNumber] - wilhelm[turnNumber];
        this.wilhelmScore += wilhelm[turnNumber] - leon[turnNumber];
    }

    public void playGame(Integer[] leon, Integer[] wilhelm, int startingCard){
        for(int i = startingCard; i<leon.length; i+=2){
            takeTurn(leon,wilhelm,i);
        }
    }

}
