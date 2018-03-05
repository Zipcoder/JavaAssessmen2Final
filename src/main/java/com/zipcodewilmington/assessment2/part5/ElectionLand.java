package com.zipcodewilmington.assessment2.part5;

public class ElectionLand {

    private String[] votes;

    public ElectionLand() {
    }

    public static Integer getNumberOfOccurrences(String[] stringArray, String stringToCount) {
        int count = 0;
        for (String value : stringArray) {
            if (value.equals(stringToCount)) count++;
        }
        return count;
    }

    public static String getMostOccurances(String[] stringArray) {
        int count = 0;
        String mostOccurances = " ";

        for(int i = 0; i < stringArray.length; i++) {
            Integer n = getNumberOfOccurrences(stringArray, stringArray[i]);
            
            if (n > count) {
                count = n;
                return stringArray[i];
            }
        } return mostOccurances;
    }

    public static String orderMostOccurances(String mostOccurances) {

    }



        public String electionWinner(String[] votes) {
        return getMostOccurances(votes);
    }
}
