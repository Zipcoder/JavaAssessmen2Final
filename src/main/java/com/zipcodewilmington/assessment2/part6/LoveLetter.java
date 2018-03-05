package com.zipcodewilmington.assessment2.part6;

import java.util.Arrays;

public class LoveLetter {

    public  LoveLetter(){

    }

    public Integer[]mystery(String[] input){
        Integer[]myResult = new Integer[0];
        for(int index =0;index<input.length;index++){
            myResult = Arrays.copyOf(myResult,myResult.length+1);
            myResult[index]=countToPalindrom(input[index]);
        }
        return myResult;
    }


    public int countToPalindrom(String str){
        int result;
        StringBuilder builder = new StringBuilder(str);
        String reverseString = builder.reverse().toString();
        if(str.equals(reverseString)){
            result =0;
        }else {
            char[] myChar = str.toCharArray();
            if (myChar.length % 2 == 0) {
                char[] frontHalf = new char[myChar.length / 2];
                char[] backHalf = new char[myChar.length/ 2];
                for (int i = 0; i < myChar.length/ 2; i++) {
                    frontHalf[i] = myChar[i];
                }
                int j = 0;
                for (int i = myChar.length- 1; i >= myChar.length/2; i--) {
                    backHalf[j] = myChar[i];
                    j++;
                }
                result =reduceLetters(frontHalf, backHalf, myChar.length / 2);
            }else{
                char[] frontHalf = new char[str.length() / 2];
                char[] backHalf = new char[str.length() / 2];
                for (int i = 0; i < str.length() / 2; i++) {
                    frontHalf[i] = myChar[i];
                }
                int j = 0;
                for (int i = str.length() - 1; i >str.length()/2; i--) {
                    backHalf[j] = myChar[i];
                    j++;
                }
               result = reduceLetters(frontHalf, backHalf, myChar.length / 2);



            }
        }
        return result;
    }

    public int reduceLetters(char[] beginning, char[] ending, int length){
        int counter =0;
        for(int k =0;k<length;k++){
            if(value(beginning[k])!=value(ending[k])){
                char largest = findLargerLetter(beginning[k],ending[k]);
                if(largest==ending[k]){
                    counter+=value(ending[k])-value(beginning[k]);
                }else{
                    counter+=value(beginning[k])-value(ending[k]);
                }
            }
        }
        return counter;

    }

    public char findLargerLetter(char char1, char char2){
        char largest =char2;
        if(value(char1)>value(char2)){
            largest = char1;
        }
        return largest;
    }
    public int value(char alphabet){
        int value=0;
        if(alphabet=='a'){
           value = 1;
        }else if(alphabet=='b'){
            value =2;
        }else if(alphabet=='c'){
            value =3;
        }else if(alphabet=='d'){
            value =4;
        }else if(alphabet=='e'){
            value =5;
        }else if(alphabet=='f'){
            value =6;
        }else if(alphabet=='g'){
            value =7;
        }else if(alphabet=='h'){
            value =8;
        }else if(alphabet=='i'){
            value =9;
        }else if(alphabet=='j'){
            value =10;
        }else if(alphabet=='k'){
            value =11;
        }else if(alphabet=='l'){
            value =12;
        }else if(alphabet=='m'){
            value =13;
        }else if(alphabet=='n'){
            value =14;
        }else if(alphabet=='o'){
            value =15;
        }else if(alphabet=='p'){
            value =16;
        }else if(alphabet=='q'){
            value =17;
        }else if(alphabet=='r'){
            value =18;
        }else if(alphabet=='s'){
            value =19;
        }else if(alphabet=='t'){
            value =20;
        }else if(alphabet=='u'){
            value =21;
        }else if(alphabet=='v'){
            value =22;
        }else if(alphabet=='w'){
            value =23;
        }else if(alphabet=='x'){
            value =24;
        }else if(alphabet=='y'){
            value =25;
        }else if(alphabet=='z'){
            value =26;
        }

        return value;
    }

}
