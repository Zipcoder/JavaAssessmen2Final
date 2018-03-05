package com.zipcodewilmington.assessment2.part7;

public class FindTheWinner {

    public String winner(Integer[] leon, Integer[] wilhem, String input) {
        Integer leonScore = 0;
        Integer wilhemScore = 0;
        if (input.equals("Even")) {
            for (int i = 0; i < leon.length; i+=2) {
                leonScore += leon[i] - wilhem[i];
                wilhemScore += wilhem[i] - leon[i];
            }
        } else {
            for (int i = 1; i < leon.length; i+=2) {
                leonScore += leon[i] - wilhem[i];
                wilhemScore += wilhem[i] - leon[i];
            }
        }
        if (leonScore==wilhemScore) {
            return "Tie";
        } else if (leonScore > wilhemScore){
            return "Leon";
        } else {
            return "Wilhelm";
        }
    }

}
