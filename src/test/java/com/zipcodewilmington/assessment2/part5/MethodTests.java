package com.zipcodewilmington.assessment2.part5;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MethodTests {

    @Test
    public void countNumberOfVotesTest(){
        //Given
        ElectionLand testLand = new ElectionLand();
        String[] testVotes = {"Eric", "eric", "Eric", "Dan", "Vince"};

        //When
        int expected = 3;
        int actual = testLand.countNumberOfVotes(testVotes,"eric");

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findHighestNumberOfVotesTest(){
        //Given
        ElectionLand testLand = new ElectionLand();
        String[] testVotes = {"Eric", "eric", "Eric", "Dan", "Vince", "Dan", "Vince"};

        //When
        int expected = 3;
        int actual = testLand.findHighestNumberOfVotes(testVotes);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void buildGotMostVotesTest(){
        //Given
        ElectionLand testLand = new ElectionLand();
        String[] testVotes = {"Eric", "Eric", "Eric", "Dan", "Vince", "Dan", "Vince", "Dan"};

        //When
        String[] expected = {"Eric", "Dan"};
        String[] actual = testLand.buildGotMostVotes(testVotes);

        //Then
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void sortReverseAlphaTest(){
        //Given
        ElectionLand testLand = new ElectionLand();
        String[] testVotes = {"Eric", "Bob", "Zebra", "Vince"};

        //When
        String[] expected = {"Zebra", "Vince", "Eric", "Bob"};
        Arrays.sort(testVotes, new ElectionLand());
        String[] actual = testVotes;

        //Then
        Assert.assertArrayEquals(expected,actual);
    }


}
