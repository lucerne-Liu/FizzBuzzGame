package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Field;
import java.util.Scanner;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class InputReaderTest {
    InputReader reader;

    @Before
    public final void before() {
        reader = new InputReader();
    }

    private void setInputStream(String input) throws NoSuchFieldException, IllegalAccessException {
        Field scannerField = reader.getClass().getDeclaredField("scanner");
        scannerField.setAccessible(true);
        Scanner scannerWithMockedStream = new Scanner(new ByteArrayInputStream(input.getBytes()));
        scannerField.set(reader, scannerWithMockedStream);
    }

    @Test
    public void should_read_input() throws Exception {
        setInputStream("100");
        assertEquals("100", reader.read());
    }

    @Test(expected = Exception.class)
    public void should_throw_RuntimeException_when_input_less_than_0() throws Exception {
        setInputStream("-1");
        reader.read();
    }

    @Test(expected = Exception.class)
    public void should_throw_RuntimeException_when_input_non_digit() throws Exception {
        setInputStream("ss");
        reader.read();
    }

}
