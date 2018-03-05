package com.zipcodewilmington.assessment2.part5;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ElectionLand {

    public ElectionLand() {

    }

    public static Integer getNumberOfOccurrences(String[] votes, String nameToCount) {

        int count = 0;
        for (int i = 0; i < votes.length; i++) {
            if (votes[i].equals(nameToCount)) {
                count++;
            }
        }

        return count;
    }


    public String electionWinner(String[] votes) {
        HashMap<String, Integer> numOcc = new HashMap<>();
        //Arrays.sort(votes, Collections.reverseOrder());

        int index = 0;
        for (String name : votes) {
            numOcc.put(votes[index], getNumberOfOccurrences(votes, name));
            index++;
        }

        int highestNumOccs = 0;
        String numOccuringMost = "";
        for (String name : votes) {
            if (numOcc.get(name) > highestNumOccs) {
                numOccuringMost = name;
            }
        }
        return numOccuringMost;
    }
}
