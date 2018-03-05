package com.zipcodewilmington.assessment2.part6;

/**
 * filename:
 * project: question1
 * author: https://github.com/vvmk
 * date: 3/5/18
 */
public class LoveLetter {

    /**
     * ended up not using this, but I'll leave it here because I like looking at it.
     */
    protected char tryReduceChar(char letter) {
        int comp = (letter < 97) ? Character.toLowerCase(letter) : letter;
        return (Integer.compare(comp, 97) > 0) ? (char) (letter - 1) : letter;
    }

    public Integer[] mystery(String[] input) {
        Integer[] solution = new Integer[input.length];
        for (int i=0;i<input.length;i++) {
            solution[i] = reduceToPalindrome(input[i]);
        }
        return solution;
    }

    private Integer reduceToPalindrome(String s) {
        int operations = 0;

        //if palindrome, move one
        if (isPalindrome(s))
            return 0;

        int half = s.length() / 2; // don't care about middle index anyway

        char[] word = s.toCharArray();
        for (int i = 0; i < half; i++) {
            char a = word[i];
            char b = word[word.length - 1 - i];

            if (a == b) // this pair is done, save a little time
                continue;

            operations += distance(a, b);
        }

        return operations;
    }

    public String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public boolean isPalindrome(String s) {
        return (s.equalsIgnoreCase(reverse(s)));
    }

    private int distance(char a, char b) {
        return Math.abs(a - b);
    }
}
