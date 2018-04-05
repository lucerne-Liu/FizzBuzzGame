package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import java.io.Reader;

import static org.junit.Assert.*;


public class FizzBuzzGameTest {
    FizzBuzzGame game;

    @Before
    public void setup() {
        game = new FizzBuzzGame();
    }

    @Test
    public void should_return_Fizz_when_have_3() {
        assertEquals("Fizz", game.replace(3));
    }

    @Test
    public void should_return_Buzz_when_have_5() {
        assertEquals("Buzz", game.replace(5));
    }

    @Test
    public void should_return_Whizz_when_have_7() {
        assertEquals("Whizz", game.replace(7));
    }

    @Test
    public void should_return_Fizz_when_is_the_multiple_of_3() {
        assertEquals("Fizz", game.replace(9));
    }

    @Test
    public void should_return_Buzz_when_is_the_multiple_of_5() {
        assertEquals("Buzz", game.replace(10));
    }

    @Test
    public void should_return_Whizz_when_is_the_multiple_of_7() {
        assertEquals("Whizz", game.replace(14));
    }

    @Test
    public void should_return_FizzBuzz_when_is_the_multiple_of_3_and_5() {
        assertEquals("FizzBuzz", game.replace(15));
    }

    @Test
    public void should_return_FizzWhizz_when_is_the_multiple_of_3_and_7() {
        assertEquals("FizzWhizz", game.replace(21));
    }

    @Test
    public void should_return_BuzzWhizz_when_is_the_multiple_of_5_and_7() {
        assertEquals("BuzzWhizz", game.replace(70));
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_is_the_multiple_of_3_and_5_and_7() {
        assertEquals("FizzBuzzWhizz", game.replace(105));
    }
}
