package com.zipcodewilmington.assessment2.part5;

public class ElectionLand {

    public ElectionLand(){

    }

    public String electionWinner(String[] votes){
        String electionWinner = votes[0];
        for(int j=0;j<votes.length;j++){
            if(getNumberOfOccurences(votes,votes[j])>getNumberOfOccurences(votes,electionWinner)){
                electionWinner=votes[j];
            }
        }

        return electionWinner;

    }

    public int getNumberOfOccurences(String[]votes, String input){
        int count=0;
        for(int i=0;i<votes.length;i++){
            if(votes[i].equalsIgnoreCase(input)){
                count++;
            }
        }
        return count;
    }
}
