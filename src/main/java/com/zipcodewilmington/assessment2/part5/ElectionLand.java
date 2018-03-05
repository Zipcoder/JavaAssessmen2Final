package com.zipcodewilmington.assessment2.part5;

import apple.laf.JRSUIUtils;

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













//        for (String name : votes) {
//            Integer count = nameCounts.get(name);
//            if (count == null){
//                count = new Integer(0);
//                count++;
//            }
//            nameCounts.put(name, count);
//        }
//
//        TreeMap<String, Integer> finalNames = new TreeMap<>();
//
//        //int maxValueInMap =(Collections.max(nameCounts.values()));
//        int maxValueInMap = nameCounts.values().stream().max(Integer::compare).get();
//
//        for (Map.Entry<String, Integer> entry : nameCounts.entrySet()) {
//            if (entry.getValue() == maxValueInMap) {
//                finalNames.put(entry.getKey(), entry.getValue());
//            }
//        }
//
//        String winner = finalNames.lastKey();
//
//        return winner;



    }

}
