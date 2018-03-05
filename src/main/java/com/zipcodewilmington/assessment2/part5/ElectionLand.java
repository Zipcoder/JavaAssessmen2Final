package com.zipcodewilmington.assessment2.part5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ElectionLand {

    public String electionWinner(String[] votes){
        Integer maxNum = getMaxNumberOfOcc(votes);
        String[] popularVote = getModifiedArray(votes, maxNum);
        String winner;
        if(popularVote.length == 1){
            winner = popularVote[0];
        } else {
            winner = popularVote[popularVote.length-1];
        }
        return winner;
    }



    public Integer getMaxNumberOfOcc(String[] votes){
        Integer count = 0;
        int tempCount;
        String currentObjectObserved;
        //search for the most freq
        for(int i = 0; i < votes.length; i++) {
            currentObjectObserved = votes[i];
            tempCount = 0;
            for (int j = 1; j < votes.length; j++) {
                if (currentObjectObserved == votes[j]) {
                    tempCount++;
                }
            }
            if (tempCount > count) {
                count = tempCount;
            }
        }
        return count;
    }

    public String[] getModifiedArray(String[] votes, Integer maxNumOfOcc){
        ArrayList<String> popularVote = new ArrayList<>();
        popularVote.addAll(Arrays.asList(votes));
        for(String vote : votes){
            Integer numOfOcc = getNumOfOcc(votes, vote);
            if(maxNumOfOcc > numOfOcc){
                popularVote.remove(vote);
            }
        }
        popularVote.sort(alpha);
        String[] modifiedArray = popularVote.toArray(new String[popularVote.size()]);
        return modifiedArray;
    }

    public Integer getNumOfOcc(String[] votes, String observed){
        Integer counter = 0;
        for(String vote: votes){
            if(vote.equals(observed)){
                counter++;
            }
        }
        return counter;
    }
    public Comparator<String> alpha = new Comparator<String>() {
        public int compare(String o1, String o2) {
            int nameCounter = (o1.length() > o2.length() ? o1.length() : o2.length());
            for (int i = 0; i < nameCounter; i++) {
                if (o1.charAt(i) < o2.charAt(i)) {
                    return -1;
                } else if (o1.charAt(i) > o2.charAt(i)) {
                    return 1;
                }
            }
            return 0;
        }
    };
}
