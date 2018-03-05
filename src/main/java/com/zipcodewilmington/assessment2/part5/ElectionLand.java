package com.zipcodewilmington.assessment2.part5;

import java.util.*;


public class ElectionLand {

    Map<String, Integer> namesAndFrequency = new TreeMap<>();


    public String electionWinner(String[] votes) {
        List<String> names = Arrays.asList(votes);
        Integer currentValue = 0;
        for (Object s : names) {
            if (s == null) {
                currentValue = 1;
            } else {
                currentValue++;
            }
            namesAndFrequency.put(names.toString(), currentValue);
        }
        for (Map.Entry entry : namesAndFrequency.entrySet()) {
            System.out.println(entry + "\n");
        }
        return namesAndFrequency.toString();
    }
    }


//        public String electionWinner (String[] votes){
//            for (Map.Entry entry : namesAndFrequency.entrySet()) {
//                System.out.println(entry + "\n");
//            }
//            return namesAndFrequency.toString();
//        }




