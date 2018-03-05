package com.zipcodewilmington.assessment2.part7;

import java.util.ArrayList;

public class FindTheWinner {

    public String winner(Integer[] leon, Integer[] wilhelm, String input) {
        Integer leonScore = 0;
        Integer wilhelmScore = 0;

        for (int i = (input.equals("Odd") ? 1 : 0); i < leon.length ; i += 2){
            leonScore += calculateScore(leon[i], wilhelm[i]);
            wilhelmScore += calculateScore(wilhelm[i], leon[i]);
        }
        return (wilhelmScore > leonScore ? "Wilhelm" : "Leon");

    }

    public Integer calculateScore(Integer userCard, Integer opponentCard){
        Integer returnValue = userCard - opponentCard;
        return returnValue;
    }
}
