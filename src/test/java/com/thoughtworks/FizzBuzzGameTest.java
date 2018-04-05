package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzGameTest {
    public ExpectedException exception;
    FizzBuzzGame game;

    @Before
    public void setup() {
        exception =  ExpectedException.none();
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

    @Test
    public void should_return_Fizz_when_contains_3() {
        assertEquals("Fizz", game.replace(13));
    }

    @Test
    public void should_return_Fizz_when_contains_3_and_is_the_multiple_of_5_and_7() {
        assertEquals("Fizz", game.replace(35));
    }

    @Test
    public void should_return_the_same_when_is_not_special_number() {
        assertEquals("19", game.replace(19));
    }

    @Test
    public void should_return_1_result_when_input_1() {
        List<String> results = Arrays.asList("1");
        game.start(1);
        assertEquals(results,game.getResults());
    }
}
