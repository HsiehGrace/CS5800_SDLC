package Vending;

public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();

        vm.addSnack("Coke", 4, 3.01);
        vm.addSnack("Pepsi", 4, 3.05);
        vm.addSnack("Cheetos", 4, 5.01);
        vm.addSnack("Doritos", 4, 5.00);
        vm.addSnack("KitKat", 6, 2.20);
        vm.addSnack("Snickers", 6, 2.10);

        // Initial Vending Machine
        System.out.println(vm);

        // Selecting Item
        vm.selectSnack("Coke");
        System.out.println();

        // Vending machine has not changed
        System.out.println(vm);

        // Insert money + dispense snack
        vm.insertMoney(200);
        System.out.println();

        // Vending machine missing one snack
        System.out.println(vm);

        // Not enough money
        vm.selectSnack("Coke");
        vm.insertMoney(2.04);
        System.out.println();

        // Trying to insert money while in idle state
        vm.insertMoney(100);
        System.out.println();

        // Trying to select a snack while waiting for money
        vm.selectSnack("Coke");
        vm.selectSnack("Pepsi");
        vm.insertMoney(100);
        System.out.println();

        // Vending the rest of the coke
        vm.selectSnack("Coke");
        vm.insertMoney(200);
        vm.selectSnack("Coke");
        vm.insertMoney(200);
        vm.selectSnack("Coke");
        vm.insertMoney(200);
        System.out.println();

        System.out.println(vm);


    }
}