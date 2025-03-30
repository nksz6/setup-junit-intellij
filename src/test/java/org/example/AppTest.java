package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for App class.
 */
public class AppTest {
    @Test
    public void testAddition() {
        App app = new App();
        int result = app.add(2, 3);
        assertEquals(5, result, "2 + 3 should equal 5");
    }

    @Test
    public void testAdditionWithNegativeNumbers() {
        App app = new App();
        int result = app.add(-2, -3);
        assertEquals(-5, result, "-2 + -3 should equal -5");
    }
}