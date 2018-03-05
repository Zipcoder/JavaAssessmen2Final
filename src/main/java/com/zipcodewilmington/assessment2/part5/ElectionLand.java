package com.zipcodewilmington.assessment2.part5;


import java.util.ArrayList;
import java.util.Collections;

public class ElectionLand {


    public static String getMostCommon(String[] votes) {
        ArrayList<String> commonVotes = new ArrayList<>();


        for (int i = 1; i < votes.length; i++){
            for (int j = 0; j < (votes.length - 1); j++){
                if (!votes[i].equals(votes[j])){
                    commonVotes.remove(votes[j]);
                }
                if (votes[i].equals(votes[j]))
                    commonVotes.add(votes[j]); {
                }

            }
        }
        Collections.sort(commonVotes);
        String[] cvArray = commonVotes.toArray(new String[commonVotes.size()]);

        return cvArray[cvArray.length - 1];
    }


    public String electionWinner(String[] votes) {

            return getMostCommon(votes);
    }

}
