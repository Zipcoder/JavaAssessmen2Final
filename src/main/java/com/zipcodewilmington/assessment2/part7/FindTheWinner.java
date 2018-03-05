package com.zipcodewilmington.assessment2.part7;

public class FindTheWinner {


    public FindTheWinner(){

    }


    public String winner(Integer[] leon, Integer[] wilhelm, String input) {
        int leonPoints = 0;
        int wilhelmPoints = 0;
            if (input.equalsIgnoreCase("even")) {
                leonPoints += leon[0] - wilhelm[0];
                wilhelmPoints += wilhelm[0] - leon[0];
            } else if (input.equalsIgnoreCase("odd")) {
                leonPoints += leon[1] - wilhelm[1];
                wilhelmPoints += wilhelm[1] - leon[1];

            }
            for (int i = 2; i < leon.length; i++) {
                leonPoints += leon[i] - wilhelm[i];
                wilhelmPoints += wilhelm[i] - leon[i];
            }

        if(leonPoints> wilhelmPoints){
            return "Leon";
        }
        else if (wilhelmPoints > leonPoints){
            return "Wilhelm";
        }
        return "Tie";
    }
}
