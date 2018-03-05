package com.zipcodewilmington.assessment2.part5;

import java.util.Map;
import java.util.TreeMap;

/**
 * filename:
 * project: question1
 * author: https://github.com/vvmk
 * date: 3/5/18
 */
public class ElectionLand {
    private Map<String, Integer> votemap;

    public ElectionLand() {
        votemap = new TreeMap<>();
    }

    public String electionWinner(String[] votes) {
        loadVotes(votes);
        return getWinner();
    }

    protected void loadVotes(String[] votes) {
        for (String vote : votes) {
            Integer totalVotes = votemap.get(vote);
            votemap.put(vote, (totalVotes != null) ? ++totalVotes : 1);
        }
    }

    protected String getWinner() {
        String winner = "";
        Integer highestPoint = 0;
        for (String candidate : votemap.keySet()) {
            Integer v = votemap.get(candidate);
            if (v >= highestPoint) {
                winner = candidate;
                highestPoint = v;
            }
        }
        return winner;
    }
}
