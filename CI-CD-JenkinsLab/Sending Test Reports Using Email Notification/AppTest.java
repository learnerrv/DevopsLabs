package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testAdd() {
        App app = new App();
        assertEquals(5, app.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    public void testIsEvenTrue() {
        App app = new App();
        assertTrue(app.isEven(4), "4 should be even");
    }

    @Test
    public void testIsEvenFalse() {
        App app = new App();
        assertFalse(app.isEven(5), "5 should not be even");
    }
}
