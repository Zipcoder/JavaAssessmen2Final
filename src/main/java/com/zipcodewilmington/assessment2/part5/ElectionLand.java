package com.zipcodewilmington.assessment2.part5;
import java.util.Arrays;

public class ElectionLand {

    private String[] votes;

    public String electionWinner(String[] votes){
        String[] tempArray = new String[0];
        for (int i  = 0; i < votes.length; i++) {
            if (getNumberOfOccurences(votes, votes[i]) == 2){
                int possibleWinners = tempArray.length;
                tempArray = Arrays.copyOf(tempArray, tempArray.length+1);
                tempArray[possibleWinners] = votes[i];
            } else if (getNumberOfOccurences(votes, votes[i]) > 2){
                return votes[i];
            }
        }
        Arrays.sort(tempArray);
        String winner = tempArray[tempArray.length -1];

        return winner;
    }

    public Integer getNumberOfOccurences(String[] votes, String value){
        Integer count = 0;
        for (String vote : votes){
            if (vote.equalsIgnoreCase(value)){
                count++;
            }
        }
        return count;
    }


}
