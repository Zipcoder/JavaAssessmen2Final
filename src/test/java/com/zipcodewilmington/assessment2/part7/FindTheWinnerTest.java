package com.zipcodewilmington.assessment2.part7;

import org.junit.Assert;
import org.junit.Test;

public class FindTheWinnerTest {

    @Test
    public void winnerTest1(){
        Integer[] leon = {1,2,3};
        Integer[] wilhelm = {2,1,3};
        String input = "Even";
        FindTheWinner findTheWinner = new FindTheWinner();
        String expected = "Wilhelm";
        String actual = findTheWinner.winner(leon, wilhelm, input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void winnerTest2(){
        Integer[] leon = {1,2,3};
        Integer[] wilhelm = {2,1,3};
        String input = "Odd";
        FindTheWinner findTheWinner = new FindTheWinner();
        String expected = "Leon";
        String actual = findTheWinner.winner(leon, wilhelm, input);
        Assert.assertEquals(expected, actual);
    }

}
