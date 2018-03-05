package com.zipcodewilmington.assessment2.part7;

import java.lang.reflect.Field;

public class FindTheWinner {

    public FindTheWinner(){

    }


    public String winner(Integer[]firstArray,Integer[]secondArray,String input){
        int leonScore=0;
        int wilhemScore =0;
        StringBuilder winner= new StringBuilder();
        if(input.equalsIgnoreCase("odd")){
            if(firstArray[0]%2!=0){
                for(int i=1;i<firstArray.length;i++){
                    leonScore+=firstArray[i]-secondArray[i];
                    wilhemScore+=secondArray[i]-firstArray[i];
                }

                if(leonScore>wilhemScore){
                    winner.append("Leon");
                }else winner.append("Wilhelm");

            }
        }else if(input.equalsIgnoreCase("Even")){
            if(firstArray[0]%2==0){
                winner.append("Leon");
            }else winner.append("Wilhelm");
        }
        return winner.toString();
    }
}
