package com.zipcodewilmington.assessment2.part5;

import java.util.*;
import java.util.Map.Entry;

// Works for all besides last one?

public class ElectionLand {

    public String electionWinner(String[] input) {

        HashMap<String, Integer> elementCountMap = new HashMap<>();
        List<String> winners = new LinkedList<>();

        for (String i : input) {
            if (elementCountMap.containsKey(i)) {
                elementCountMap.put(i, elementCountMap.get(i)+1);
            } else {
                elementCountMap.put(i, 1);
            }
        }
        String element;
        int frequency = 1;
        Set<Entry<String, Integer>> entrySet = elementCountMap.entrySet();
        for (Entry<String, Integer> entry : entrySet) {
            if(entry.getValue() > frequency) {
                element = entry.getKey();
                winners.add(element);
            } else {
                frequency = 1;
            }
        }
        Collections.sort(winners);
        return winners.get(winners.size()-1);
    }

}
