package Vending;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnackDispenseHandlerTest extends SnackDispenseHandler {

    SnackDispenseHandler snackDispenseHandler;

    @BeforeEach
    void setUp() {
        snackDispenseHandler = new SnackDispenseHandler();
    }

    @Test
    void testNewSnack() {
        snackDispenseHandler.newSnack("Test");
        assertEquals(snackDispenseHandler.snackName, "Test");
    }

    @Test
    void testDispenseSnack() {
        snackDispenseHandler.newSnack("Test");
        assertTrue(snackDispenseHandler.dispenseSnack("Test"));
    }
}