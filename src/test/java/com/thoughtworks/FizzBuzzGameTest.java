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
}
