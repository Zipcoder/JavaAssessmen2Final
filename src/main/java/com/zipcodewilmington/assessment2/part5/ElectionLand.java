package com.zipcodewilmington.assessment2.part5;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class ElectionLand {

    public String electionWinner(String[] votes){
        StringBuilder guyVoted = new StringBuilder();
        int vote = 0;
        int mostVotes = vote + 1;

        for (int i = 0; i < votes.length; i++){
            for (int j = 0; j < votes.length; j++){
                if (votes[i].equals(votes[j])){
                    vote++;

                }
            }
            if ((vote > mostVotes)){
                guyVoted.append(votes[i] + ",");
            }
            vote = 0;

        }
        String [] voteArray = guyVoted.toString().split(",");

        Arrays.sort(voteArray, Collections.reverseOrder());

        return voteArray[0];
    }


}
