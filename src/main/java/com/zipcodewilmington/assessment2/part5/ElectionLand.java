package com.zipcodewilmington.assessment2.part5;

import java.util.Arrays;
import java.util.Collections;

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
        String[]winners =new String[1];
        winners[0]=electionWinner;
        int index =1;
        for(int k =0;k<votes.length;k++){

            if(getNumberOfOccurences(votes, votes[k])==getNumberOfOccurences(votes,electionWinner)){
                winners= Arrays.copyOf(winners,winners.length+1);
                winners[index]=votes[k];
                index++;
            }
        }
        Arrays.sort(winners);

        return winners[winners.length-1];


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
