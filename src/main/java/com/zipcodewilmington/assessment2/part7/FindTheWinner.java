package com.zipcodewilmington.assessment2.part7;

import java.lang.reflect.Field;

public class FindTheWinner {

    public FindTheWinner(){

    }


    public String winner(Integer[]firstArray,Integer[]secondArray,String input){

        StringBuilder winner= new StringBuilder();
        if(input.equalsIgnoreCase("odd")){
            if(firstArray[0]%2!=0){

                winner.append(firstArray.getClass().getSimpleName());
            }
            else winner.append(secondArray);
        }else if(input.equalsIgnoreCase("Even")){
            if(firstArray[0]%2==0){
                winner.append(firstArray);
            }else winner.append(secondArray);
        }
        return winner.toString();
    }
}
