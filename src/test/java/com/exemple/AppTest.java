package com.exemple;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    @Test
    public void testAddition() {
        assertEquals(5, App.addition(2, 3));
    }
}
