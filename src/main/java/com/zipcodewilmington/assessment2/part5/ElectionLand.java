package com.zipcodewilmington.assessment2.part5;

import java.util.*;

public class ElectionLand {


        public String electionWinner (String[] stringArray) {
            //created a tree map to order in REVERSE order
            Map<String, Integer> map = new TreeMap<>(Collections.reverseOrder());
            for (String runnersName : stringArray) {
                //iterate through array to see if how many times runnersName is entered.
                if (map.containsKey(runnersName)) {
                    map.put(runnersName, map.get(runnersName) + 1);
                    //keep adding to value if you keep seeing the name - WILL COMPARE BY VALUE LATER
                } else {
                    map.put(runnersName, 1);
                }
            }
            //find the most entered value and then get the corresponding key.
            return(Collections.max(map.entrySet(), Map.Entry.comparingByValue())
                    .getKey());
    }
}
