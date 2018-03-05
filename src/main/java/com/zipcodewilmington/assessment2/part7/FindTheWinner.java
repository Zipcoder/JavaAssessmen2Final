package com.zipcodewilmington.assessment2.part7;

/**
 * filename:
 * project: question1
 * author: https://github.com/vvmk
 * date: 3/5/18
 */
public class FindTheWinner {

    public String winner(Integer[] leon, Integer[] wilhem, String input) {
        int wilhemScore = 0;
        int leonScore = 0;

       if (leon.length != wilhem.length)
           return "The decks are uneven, chump";

       int start = (input.equalsIgnoreCase("even")) ? 0 : 1;
       for (int i = start;i<leon.length;i+=2) {
           wilhemScore += (wilhem[i] - leon[i]);
           leonScore += (leon[i] - wilhem[i]);
       }

       return (wilhemScore >= leonScore) ? "Wilhem" : "Leon";
    }
}
