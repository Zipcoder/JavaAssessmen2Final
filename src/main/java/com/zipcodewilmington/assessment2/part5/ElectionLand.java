package com.zipcodewilmington.assessment2.part5;

import java.util.*;

public class ElectionLand {


    public String electionWinner(String[] votes) {
        Arrays.sort(votes);
        HashMap<Integer, String> stringHashMap = new HashMap<>();
        Integer key = 1;

        for (int i = 0; i < votes.length; i++){
            String value = "";
            if (!stringHashMap.containsValue(votes[i])){
                stringHashMap.put(key, votes[i]);
            }
            else {
                stringHashMap.put(key+1, votes[i]);
            }
        }
        int temp = 0;
        for(Map.Entry<Integer, String> entry :stringHashMap.entrySet()){
            if(entry.getKey() >= temp){
                temp = entry.getKey();
            }
        }

     return   stringHashMap.get(temp);



}
}
