package com.zipcodewilmington.assessment2.part5;

import java.util.Arrays;
import java.util.Collections;

public class ElectionLand {

    public String electionWinner(String[] votes) {

        Arrays.sort(votes, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));

        boolean[] seen = new boolean[votes.length];
        String voteResult = null;
        int resultCount = 0;
        for (int i = 0; i < votes.length; i++) {
            if (!seen[i]) {
                seen[i] = true;
                int count = 1;
                for (int j = i + 1; j < votes.length; j++) {
                    if (!seen[j]) {
                        if (votes[i].equals(votes[j])) {
                            seen[j] = true;
                            count++;
                        }
                    }
                }
                if (count > resultCount) {
                    resultCount = count;
                    voteResult= votes[i];
                }
            }
        }
        return voteResult;
    }
}
