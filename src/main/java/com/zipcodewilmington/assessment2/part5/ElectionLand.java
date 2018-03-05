package com.zipcodewilmington.assessment2.part5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class ElectionLand {


    public int countOccurences(String[] votes, String indexValue){
        int count = 0;
        for(int i = 0; i<votes.length; i++){
            if(votes[i].equals(indexValue)){
                count++;
            }
        }
        return count;
    }

    public String electionWinner(String[] votes){
        ArrayList<String> candidates = new ArrayList<>();
        for(int i = 0; i<votes.length; i++){
            for(int j = 0; j<votes.length; j++) {
                if(countOccurences(votes, votes[i]) > countOccurences(votes, votes[j])) {
                    candidates.add(votes[i]);
                }
            }
        }
        Collections.sort(candidates);
        int length = candidates.size();
        if(length == 0) {
            return null;
        } else return candidates.get(length-1);
    }


}
