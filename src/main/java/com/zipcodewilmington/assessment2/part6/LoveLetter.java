package com.zipcodewilmington.assessment2.part6;

public class LoveLetter {

    /**
     * NEED TO:
     * 0. ----Make int[] responseArray
     * 1. ----iterate through original array
     * 2. ----make check if palindrome method
     * 3. need to change last letter in string to one letter before in the alphabet
     * 4. can do 3. with letter-- but has to read as char
     */

    public Integer[] mystery(String[] input) {
        Integer[] response = new Integer[input.length];
        for (int i = 0; i < input.length; i++) {
            int count = 0;
            while (!(isPalindrome(input[i]))) {
                if (input[i].charAt(0) != input[i].charAt(input[i].length()-1)) {
                    String modifiedWord = wordChanger(input[i], input[i].length()-1);
                    count++;
                    if (isPalindrome(modifiedWord)) {
                        break;
                    }
                }
            }
            response[i] = count;
        }
        return response;
    }

    public boolean isPalindrome(String string) {
        return string.equals(new StringBuilder(string).reverse().toString());
    }

    public String wordChanger(String word, int index) {
        StringBuilder changedWord = new StringBuilder(word);
        changedWord.setCharAt(index, (char) ((word.charAt(index))-1));
        return changedWord.toString();
    }

}
