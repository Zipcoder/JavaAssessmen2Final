package com.zipcodewilmington.assessment2.part7;

public class FindTheWinner {


     public String winner(Integer[] leon, Integer[] wilhelm, String input) {
         int leonPoints = 0;
         int wilhelmPoints = 0;

         if(input.equalsIgnoreCase("Even")) {
             for(int i = 0; i < leon.length; i++) {
                 if(i % 2 == 0) {
                     leonPoints += leon[i] - wilhelm[i];
                     wilhelmPoints += wilhelm[i] - leon[i];
                 }
             }
         }
         else {
             for (int j = 0; j < leon.length; j++) {
                 if (j % 2 != 0) {
                     leonPoints += leon[j] - wilhelm[j];
                     wilhelmPoints += wilhelm[j] - leon[j];
                 }
             }
         }

         if (leonPoints > wilhelmPoints) {
             return "Leon";
         } else if( wilhelmPoints > leonPoints) {
             return "Wilhelm";
         } else {
             return "Tie";
         }
     }

}
