package com.zipcodewilmington.assessment2.part5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ElectionLand {
    private String name;
    private ArrayList<String> currentWinnersList;
    private String[] sortWinners;


    public ElectionLand() {
        this.name = name;
        currentWinnersList = new ArrayList<>();
        sortWinners = new String[currentWinnersList.size()];
    }

    public String electionWinner(String[] votes) {
        //check for all possible exceptions
        // loop through and count number of times
        String winner = " ";
        int currentWinner = 0;
        for (int i = 0; i < votes.length; i++) {
            if (currentWinner < voteCount(votes, votes[i])) {
                currentWinnersList.clear();
                winner = votes[i];
                currentWinnersList.add(winner);
            } else if (currentWinner == voteCount(votes, votes[i])) {
                winner = votes[i];
                currentWinnersList.add(winner);
            }
        }
        // if there is a tie then determine the winner by name
        if (currentWinnersList.size() > 1) {
            sortWinners = getArray();
             winner = getWinner();
        }
        return winner;
    }

    public int voteCount(String[] votes, String vote) {
        int count = 0;
        for (int i = 0; i < votes.length; i++) {
            if (votes[i].equalsIgnoreCase(vote)) {
                count++;
            }
        }
        return count;
    }


    public void addNameToCurrentWinnerslist(String name) {
        currentWinnersList.add(name);
    }

    public ArrayList<String> getNames() {
        return currentWinnersList;
    }

    public String[] getArray() {
       return currentWinnersList.toArray(new String[0]);
    }


    public void clear() {
        currentWinnersList.clear();
    }

    public String getWinner() {
       Arrays.sort(sortWinners, getWinnerByName);
    return this.sortWinners[0];
    }


    public static Comparator<String> getWinnerByName;

    static {
        getWinnerByName = new Comparator<String>() {

            @Override
            public int compare(String name1, String name2) {
                if (name1.compareToIgnoreCase(name2) < 0) {
                    return -1;
                } else if (name1.compareToIgnoreCase(name2) > 1) {
                    return 1;
                }
                return 0;
            }
        };
    }
}
