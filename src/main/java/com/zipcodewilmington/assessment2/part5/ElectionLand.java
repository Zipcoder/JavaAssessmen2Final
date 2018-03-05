package com.zipcodewilmington.assessment2.part5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ElectionLand implements Comparator<String> {

    private String[] gotMostVotes = new String[0];


    public String electionWinner(String[] votes){
       this.gotMostVotes = this.buildGotMostVotes(votes);
       Arrays.sort(this.gotMostVotes, this);

        return this.gotMostVotes[0];
    }

    public int countNumberOfVotes(String[] votes, String name){
        int count = 0;
        for(String s : votes){
            if(s.equalsIgnoreCase(name)){
                count++;
            }
        }
        return count;
    }

    public String[] buildGotMostVotes(String[] votes){
        ArrayList<String> gotMostVotes = new ArrayList<>(0);
        int highestNumber = this.findHighestNumberOfVotes(votes);
        for (String s : votes){
            if(gotMostVotes.contains(s)){
                continue;
            }
            else if(this.countNumberOfVotes(votes,s) == highestNumber){
                gotMostVotes.add(s);
            }
        }
        return gotMostVotes.toArray(new String[0]);
    }

    public int findHighestNumberOfVotes(String[] votes){
        int highestNumber = 0;
        for (String s : votes){
            if(this.countNumberOfVotes(votes, s) > highestNumber){
                highestNumber = this.countNumberOfVotes(votes, s);
            }
        }
        return highestNumber;
    }


    @Override
    public int compare(String o1, String o2) {
        return o2.compareToIgnoreCase(o1) - o1.compareToIgnoreCase(o2) ;
    }
}
