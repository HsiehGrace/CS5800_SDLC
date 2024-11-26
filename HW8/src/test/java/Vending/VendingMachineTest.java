package Vending;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendingMachineTest extends VendingMachine {

    VendingMachine vm;

    @BeforeEach
    void setUp() {
        vm = new VendingMachine();
        vm.addSnack("Coke", 4, 3.01);
        vm.addSnack("Pepsi", 4, 3.05);
        vm.addSnack("Cheetos", 4, 5.01);
        vm.addSnack("Doritos", 4, 5.00);
        vm.addSnack("KitKat", 6, 2.20);
        vm.addSnack("Snickers", 6, 2.10);
    }

    @Test
    void testSelectSnack() {
        vm.selectSnack("Cheetos");
        assertEquals(2, vm.snackSelected);
    }

    @Test
    void testInsertMoney() {
        vm.selectSnack("Cheetos");
        vm.insertMoney(200);
        assertEquals(3, vm.snacks.get(2).getQuantity());
    }

    @Test
    void testFindSnack() {
        assertEquals(2, vm.findSnack("Cheetos"));
    }
}