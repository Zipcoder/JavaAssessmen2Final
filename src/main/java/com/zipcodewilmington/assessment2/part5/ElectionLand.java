package com.zipcodewilmington.assessment2.part5;

import java.util.*;

public class ElectionLand {
    String[] votes;


    public String electionWinner(String[] votes) {
        ArrayList candidates = new ArrayList<String>(Arrays.asList(votes));
        Collections.sort(candidates);

        int totalSize = candidates.size();
        int count = 0;
        String winner = null;
        for (String current : votes) {
            int running = 0;
            for (String other : votes) {
                if (current.equals(other)) {
                    running++;
                }
            }
            if (running >= count) {
                count = running;
                winner = current;
            }
        }
        return winner;
    }
}


// public String electionWinner(String[] votes) {
////        ArrayList countedVotes = new ArrayList<String>(Arrays.asList(votes));
////
////        int winnerCount = 0;
////        String winner = null;
////
////        for (int i = 0; i < countedVotes.size(); i++) {
////            String currentPerson = votes[i];
////            int currentVotes = 0;
////            for (int j = 0; j < countedVotes.size(); j++) {
////                if (currentPerson == votes[j]) {
////                    currentVotes++;
////                    winnerCount += currentVotes;
////                    currentPerson = winner;
////                    if (currentVotes >= winnerCount) {
////                        currentPerson = winner;
////                    }
////                }
////
////            }
////            return winner;
////
////        }return null;
////    }