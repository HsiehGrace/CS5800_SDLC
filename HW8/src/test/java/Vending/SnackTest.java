package Vending;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnackTest extends Snack {

    Snack testSnack;
    int defaultQuantity = 10;

    @BeforeEach
    void setUp() {
        testSnack = new Snack("Test", 1, 10);
    }

    @Test
    void testAddQuantity() {
        testSnack.addQuantity(3);
        assertEquals(defaultQuantity + 3, testSnack.getQuantity());
    }

    @Test
    void testDispense() {
        testSnack.dispense();
        assertEquals(defaultQuantity - 1, testSnack.getQuantity());
    }

    @Test
    void testEquals() {
        assertEquals(testSnack, testSnack);
        assertTrue(testSnack.equals("Test"));
    }

    @Test
    void testToString() {
        assertEquals("Test, $1.0, Quantity: " + defaultQuantity, testSnack.toString());
    }
}