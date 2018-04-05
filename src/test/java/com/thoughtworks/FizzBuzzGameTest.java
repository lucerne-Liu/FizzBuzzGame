package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class FizzBuzzGameTest {
    FizzBuzzGameTest game;

    @Before
    public void setup() {
        game = new FizzBuzzGameTest();
    }

    @Test
    public void should_return_Fizz_when_have_3() {
        assertEquals("Fizz", game.replace(3));

    }
}
