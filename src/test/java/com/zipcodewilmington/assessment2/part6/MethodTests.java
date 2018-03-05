package com.zipcodewilmington.assessment2.part6;

import org.junit.Assert;
import org.junit.Test;

public class MethodTests {

    LoveLetter test = new LoveLetter();

    @Test
    public void isPalindromeTest(){
        Assert.assertTrue(LoveLetter.isPalindrome("abba"));
    }

    @Test
    public void isPalindromeTest2(){
        Assert.assertTrue(LoveLetter.isPalindrome("abcba"));
    }

    @Test
    public void isPalindromeFalseTest(){
        Assert.assertFalse(LoveLetter.isPalindrome("acba"));
    }

    @Test
    public void isPalindromeFalseTest2(){
        Assert.assertFalse(LoveLetter.isPalindrome("adcba"));
    }

    @Test
    public void decrementLetterTest(){
        //Given
        String original = "abbc";

        //When
        String expected = "abbb";
        String actual = LoveLetter.decrementLetter(original, 3);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void countNumberOfOperationsTest(){
        //Given
        String test = "vpllamwr";

        //When
        int expected = 23;
        int actual = LoveLetter.countNumberOfOperations(test);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void countNumberOfOperationsTest2(){
        //Given
        String test = "fdjsqlgmcux";

        //When
        int expected = 58;
        int actual = LoveLetter.countNumberOfOperations(test);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void countNumberOfOperationsTest3(){
        //Given
        String test = "abba";

        //When
        int expected = 0;
        int actual = LoveLetter.countNumberOfOperations(test);

        //Then
        Assert.assertEquals(expected,actual);
    }



}
