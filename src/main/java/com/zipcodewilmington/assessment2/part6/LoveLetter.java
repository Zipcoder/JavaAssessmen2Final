package com.zipcodewilmington.assessment2.part6;

public class LoveLetter {
    private String[] i;

    public Integer[] mystery(String[] i){
        Integer[] countsUntilPalindrome = new Integer[this.i.length];
        for (Integer count : countsUntilPalindrome){
            return null;
        }
        return null;
    }

    public String getIndex(){
        for (int i =0; i < this.i.length; i++){
           return this.i[i];
        }
        return null;
    }

    public boolean checkIfIndexIsPalindrome(String index){
        for (int i = 0; i < index.length(); i++){
            if (index.charAt(i) == index.charAt(index.length() -1)){
                return true;
            }
        }
        return false;
    }

  public Integer makeIndexAPalindrome(String index){
        Integer count = 0;
        String initial = "";
        while (!checkIfIndexIsPalindrome(initial + index)){
            initial += index.charAt(index.length() -1);
            count++;
        }
        return count;
  }

}
