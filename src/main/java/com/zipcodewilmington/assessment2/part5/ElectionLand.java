package com.zipcodewilmington.assessment2.part5;

public class ElectionLand {

    String[] votes;


    public String electionWinner(String[] votes) {

        Integer count = 0;
        Integer largest = 0;
        String winner = "";
        for (int i = 0; i < votes.length; i++) {
            for (int x = 1; x < votes.length; x++) {
                if (votes[i].equalsIgnoreCase(votes[x])) {
                    count++;
                }
                if (count > largest) {
                    largest = count;
                    winner = votes[i];
                } else if (count == largest) {
                    int compare = winner.compareTo(votes[i].toString());
                    if (compare < 0)
                        winner = votes[i];
                    else if (compare > 0)
                        winner = winner;
                }

            }


        }
        return winner;
    }
}
