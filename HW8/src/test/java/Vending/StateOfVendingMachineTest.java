package Vending;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StateOfVendingMachineTest extends StateOfVendingMachine {

    StateOfVendingMachine testMachine;
    @BeforeEach
    void setUp() {
        testMachine = new StateOfVendingMachine();
    }

    @Test
    void testCheckState() {
        assertTrue(testMachine.checkState(0));
        assertFalse(testMachine.checkState(1));
    }

    @Test
    void testNextState() {
        testMachine.nextState();
        assertTrue(testMachine.checkState(1));
    }

    @Test
    void testReset() {
        testMachine.reset();
        assertTrue(checkState(0));
    }
}