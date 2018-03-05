package com.zipcodewilmington.assessment2.part5;


import java.util.*;

public class ElectionLand {

    public ElectionLand(){

    }

    public String electionWinner(String[] votes) {

        Map<String, Integer> nameCounts = new HashMap<>();

        for(String name : votes) {
            if (!nameCounts.containsKey(name)) {
                nameCounts.put(name, 1);
            } else {
                nameCounts.put(name, nameCounts.get(name) + 1);
            }
        }

        TreeMap<String, Integer> finalNames = new TreeMap<>();

        int maxValueInMap = (Collections.max(nameCounts.values()));

        for (Map.Entry<String, Integer> entry : nameCounts.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                finalNames.put(entry.getKey(), entry.getValue());
            }
        }

        String finalName = finalNames.lastKey();

        return finalName;

    }

}
