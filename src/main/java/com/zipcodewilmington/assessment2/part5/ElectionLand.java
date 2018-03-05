package com.zipcodewilmington.assessment2.part5;

import java.util.Arrays;

public class ElectionLand {


    public ElectionLand() {

    }

    public String electionWinner(String[] votes) {

        int winningAmount = getHighestVotes(votes);
        int countOfTie = 0;

        for (int i = 0; i < votes.length; i++) {
            if (getNumberOfVotes(votes, votes[i]) == winningAmount) {
                countOfTie++;
            }
        }

        String[] tieArray = new String[countOfTie];
        int secondIterator = 0;

        for (int j = 0; j < votes.length; j++) {
            if (getNumberOfVotes(votes, votes[j]) == winningAmount) {
                tieArray[secondIterator] = votes[j];
                secondIterator++;
            }
        }

        Arrays.sort(tieArray);

        return tieArray[tieArray.length - 1];
    }


    public int getHighestVotes(String[] votes) {
        int highest = 0;

        for (int i = 0; i < votes.length; i++) {
            if (getNumberOfVotes(votes, votes[i]) > highest) {
                highest = getNumberOfVotes(votes, votes[i]);
            }
        }
        return highest;
    }

    public int getNumberOfVotes(String[] votes, String aVote) {
        int count = 0;

        for (int i = 0; i < votes.length; i++) {
            if (votes[i].equalsIgnoreCase(aVote)){
                count++;
            }
        }
        return count;
    }

}
