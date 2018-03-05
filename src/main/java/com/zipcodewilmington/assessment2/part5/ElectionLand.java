package com.zipcodewilmington.assessment2.part5;
import java.util.*;

public class ElectionLand {

    public String electionWinner(String[] votes) {

        TreeMap<String, Integer> voting = new TreeMap<>();
        for (String name: votes) {
            if (voting.keySet().contains(name))
                voting.put(name, voting.get(name) + 1);
            else voting.put(name, 1);
        }
        Map.Entry<String, Integer> maxEntry =null;

        for (Map.Entry<String, Integer> entry : voting.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) >= 0) {
                maxEntry = entry;
            }
        }
        return maxEntry.getKey().toString();



        //return (Collections.max(voting.entrySet(), Map.Entry.comparingByValue()).getKey());
    }


}
