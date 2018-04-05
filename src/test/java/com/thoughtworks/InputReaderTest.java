package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class InputReaderTest {
    InputReader reader;

    @Before
    public final void before() {
        reader = new InputReader();
    }

    @Test
    public void should_read_input() {
        reader = mock(InputReader.class);
        when(reader.read()).thenReturn("100");
        assertEquals("100", reader.read());
    }
}
