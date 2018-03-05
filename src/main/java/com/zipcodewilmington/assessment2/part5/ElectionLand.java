package com.zipcodewilmington.assessment2.part5;

import java.util.Arrays;
import java.util.Collections;

public class ElectionLand {

    //private String[] votes = {};
    private String personWhoGotElected = "";

    public ElectionLand(){

    }


    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {

        int numOfOccurrences = 0;

        for (Object element : objectArray) {
            if (element.equals(objectToCount)) {
                numOfOccurrences++;
            }
        }

        return numOfOccurrences;
    }

    public static String electionWinner(String[] votes) {

        /*Arrays.sort(intArray, Collections.reverseOrder());

        HAHHAHAHHAHHAHHAHAHAHHAHHAHAHHAHHAHAHHAHHAHAHA I Y F B
         */

        Arrays.sort(votes, Collections.reverseOrder());

        Integer theLargestSoFar = 0;
        String personWhoGotElected = "";
        for (int i = 0; i < votes.length; i++) {
            Integer numberOfOccurrences = getNumberOfOccurrences(votes, votes[i]);
            if (numberOfOccurrences > theLargestSoFar) {
                theLargestSoFar = numberOfOccurrences;
                personWhoGotElected = votes[i];
            }
        }
        return personWhoGotElected;

    }

/*below are the "blank templates":

    --------blank templates start:

    public static Object getMostCommon(Object[] objectArray) {

        Integer theLargestSoFar = 0;
        Object mostCommonObject = null;
        for (int i = 0; i < objectArray.length; i++) {
            Integer numberOfOccurrences = getNumberOfOccurrences(objectArray, objectArray[i]);
            if (numberOfOccurrences > theLargestSoFar) {
                theLargestSoFar = numberOfOccurrences;
                mostCommonObject = objectArray[i];
            }
        }
        return mostCommonObject;

    }

        public String electionWinner(String[] votes) {
        Arrays.sort(votes);

        return personWhoGotElected;
    }

    -------blank templates end.

    */

    //    public Integer getNumberOfOccurrences(String[] strArray, String strToCount){
//
//    }

}
