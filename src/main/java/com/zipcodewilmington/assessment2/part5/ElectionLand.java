package com.zipcodewilmington.assessment2.part5;

import java.util.*;

public class ElectionLand {
    String[] votes;

    public String electionWinner(String[] votes) {

        int votePerPerson = 0;
        List asList = Arrays.asList(votes);
        Set<String> mySet = new HashSet<String>(asList);
        for(String s: mySet){

            Collections.frequency(asList,s);


        }
//        for (int i = 0; i < votes.length; i++) {
//            if (votes[i].equalsIgnoreCase(votes[i])){
//
//
//            }
//        }
    return null;
    }
}
