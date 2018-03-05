package com.zipcodewilmington.assessment2.part5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class ElectionLand {


    public String electionWinner(String[] votes) {
        //Take in array of votes, loop through array, create key for each name, when
        //come across the name again use value as the tally for the number of votes.
        //
        TreeMap<String, Integer> tally = new TreeMap<>();
        for (String vote : votes) {
            //check to see if key exists, if it does retrieve current tally and add 1
            if (tally.containsKey(vote)) {
                Integer current = tally.get(vote);
                current++;
                tally.put(vote, current);
            } else {
                //if key does not exist create key with a tally of 1 for first vote
                tally.put(vote, 1);
            }
        }

        //since there could be multiple people with maxvotes add them to a list
        Integer maxVotes = 0;
        ArrayList<String> winners = null;

        //loop through treeMap return candidate and her tally.
        for (Map.Entry<String, Integer> entry : tally.entrySet()) {
            Integer vote = entry.getValue();
            String candidate = entry.getKey();
            //if tally is larger than current tally, increase maxVotes counter,
            //and add candidate to list of winners
            //if tally equals maxVotes then add candidate to list of winners but don't change maxVotes
            //if tally less than maxVotes ignore
            if (vote > maxVotes) {
                maxVotes = vote;
                winners = new ArrayList<>();
                winners.add(candidate);
            } else if (vote == maxVotes) {
                winners.add(candidate);
            }
        }
        //use Arrays.sort to put in alphabetical order and return last person in the array.
        String[] winnersArray = winners.toArray(new String[0]);
        Arrays.sort(winnersArray);

        return winnersArray[winnersArray.length-1];
    }
}