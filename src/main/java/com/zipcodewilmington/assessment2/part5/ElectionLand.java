package com.zipcodewilmington.assessment2.part5;

import java.util.ArrayList;
import java.util.Collections;

public class ElectionLand {

    public String electionWinner(String[] votes) {

        ArrayList<String> votesList = new ArrayList<>();

        for (int i = 0; i < votes.length; i++) {
            votesList.add(votes[i]);
        }
        Collections.sort(votesList);

        int votesToBeat = 0;
        String winner = "";
        int votesPersonHas = 0;
        for (String name: votesList) {
            for (String nextName: votesList) {
                if(name.equals(nextName)){
                    votesPersonHas++;
                }
            }
            if (votesPersonHas >= votesToBeat){
                winner = name;
                votesToBeat = votesPersonHas;
            }
            votesPersonHas = 0;
        }


        return winner;
    }
}
