package com.zipcodewilmington.assessment2.part6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * filename:
 * project: question1
 * author: https://github.com/vvmk
 * date: 3/5/18
 */
public class LoveLetterReduceTest {
    private LoveLetter letter;
    @Before
    public void setup() {
        letter = new LoveLetter();
    }

    @Test
    public void testReduceSuccessLowerCase() {
        char input = 'b';
        char expected = 'a';
        char actual = letter.tryReduceChar(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReduceFailLowerCase() {
        char expected = 'a';
        char actual = letter.tryReduceChar(expected);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReduceSuccessUpperCase() {
        char input = 'B';
        char expected = 'A';
        char actual = letter.tryReduceChar(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReduceFailUpperCase() {
        char expected = 'A';
        char actual = letter.tryReduceChar(expected);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testReverse() {
        String expected = "niR";
        String actual = letter.reverse("Rin");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsDromeNope() {
        String expected = "nope";

        Assert.assertFalse(letter.isPalindrome(expected));
    }

    @Test
    public void testIsDromeYep() {
        String expected = "aba";

        Assert.assertTrue(letter.isPalindrome(expected));
    }
}