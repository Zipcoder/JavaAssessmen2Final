package com.zipcodewilmington.assessment2.part5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ElectionLand {

    protected HashMap<String, Integer> hashMap;

    public ElectionLand() {
        this.hashMap = new HashMap<String, Integer>();
    }

    public String electionWinner(String[] votes) {

        // put all Strings in a vote hashmap
        hashMap = placeVotesIntoHashMap(votes);

        int maxNumberOfVotes = 0;
        String winner = "";

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String candidate = entry.getKey();
            Integer numberOfVotes = entry.getValue();
            if (numberOfVotes > maxNumberOfVotes) {
                maxNumberOfVotes = numberOfVotes;
                winner = candidate;
            } else if ((numberOfVotes == maxNumberOfVotes) &&
                    (winner.compareTo(candidate) < 0)) {
                winner = candidate;
            }
        }
        return winner;
    }

    public HashMap<String, Integer> placeVotesIntoHashMap(String[] votes) {
        for (String candidateName : votes) {
            if (hashMap.keySet().contains(candidateName)) {
                hashMap.put(candidateName, hashMap.get(candidateName) + 1);
            } else {
                hashMap.put(candidateName, 1);
            }
        }
        return hashMap;
    }


}
