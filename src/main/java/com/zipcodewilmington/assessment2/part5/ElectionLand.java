package com.zipcodewilmington.assessment2.part5;

import java.util.*;

public class ElectionLand {


    public String electionWinner(String[] votes) {
        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();

                for (int i = 0; i < votes.length; i++) {
                if (stringTreeMap.keySet().contains(votes[i])){
                 stringTreeMap.put(votes[i], stringTreeMap.get(votes[i]) +1);
            }
            else {
                    stringTreeMap.put(votes[i], 1);
                }

        }
            int temp = 0;
                String winner ="";
        for(Map.Entry<String, Integer> entry :stringTreeMap.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            if(value > temp){
                temp = value;
                winner = key;
            }
            else if (value == temp && winner.compareTo(key)<0){
                winner = key;
            }

        }
     return   winner;



}
}
