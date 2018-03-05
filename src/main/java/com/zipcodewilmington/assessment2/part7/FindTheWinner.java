package com.zipcodewilmington.assessment2.part7;

import java.awt.print.Paper;

public class FindTheWinner {

    Integer[] leon;
    Integer[] wilhelm;
    String input;
    int leonScore = 0;
    int wilhelmScore = 0;

    public String winner(Integer[]leon, Integer[]wilhelm, String input){
        if (input.equalsIgnoreCase("even")){
            leonScore += leon[0] - wilhelm[0];
            leonScore += leon[2] - wilhelm[2];
            wilhelmScore += wilhelm[0] - leon[0];
            wilhelmScore += wilhelm[2] - leon[2];
        }
        else if (input.equalsIgnoreCase("odd")){
            leonScore += leon[1] - wilhelm[1];
            wilhelmScore += wilhelm[1] - leon[1];
        }
        return winGuy();
    }
    public String winGuy(){
        if (wilhelmScore > leonScore){
            return "Wilhelm";
        }
        if (wilhelmScore <leonScore){
            return "Leon";
        }
        return "Tie";
    }
}
