package Vending;

import java.util.ArrayList;

public class VendingMachine {

    ArrayList<Snack> snacks;
    StateOfVendingMachine stateOfVendingMachine;
    SnackDispenseHandler snackDispenser;

    int snackSelected;

    VendingMachine() {
        this.snacks = new ArrayList<>();
        this.stateOfVendingMachine = new StateOfVendingMachine();
        this.snackDispenser = new SnackDispenseHandler();
    }

    // New Snacks
    public void addSnack(String snackName, int quantity, double price){
        Snack tempSnack = new Snack(snackName, price, quantity);
        this.snacks.add(tempSnack);
        this.snackDispenser.newSnack(snackName);
    }

    // Existing Snacks, add more quantity to them
    public void addSnack(String snackName, int quantity) {

        int snackIndex = this.findSnack(snackName);

        // Snack doesn't exist, add it and tell user to add info later
        if (snackIndex == -1) {
            this.addSnack(snackName, 0, 1);
            System.out.println(snackName + " not found. Added to machine at $0.00");
        }
        else
        {
            this.snacks.get(snackIndex).addQuantity(quantity);
        }
    }

    // Change Price of an existing snack
    public void changePrice(String snackName, double newPrice){

        int snackIndex = this.findSnack(snackName);

        if (snackIndex == -1) {
            System.out.println(snackName + " not found.");
        }
        else
        {
            this.snacks.get(snackIndex).setPrice(newPrice);
            System.out.println(snackName + " changed to $" + newPrice);
        }

    }

    // User Selects a snack
    public void selectSnack(String snackName){

        // Check State of Machine
        if(!stateOfVendingMachine.checkState(0)){
            return;
        }

        int snackIndex = this.findSnack(snackName);

        if (snackIndex == -1) {
            System.out.println(snackName + " not found.");
        }
        else
        {
            System.out.println(snackName + " selected.");
            this.snackSelected = snackIndex;
            this.stateOfVendingMachine.nextState();
        }
    }

    // User inserts money and the vending machine dispenses it back
    public void insertMoney(double money){

        // Check state of machine
        if(!stateOfVendingMachine.checkState(1)){
            return;
        }

        // Check amount of money
        if(this.snacks.get(this.snackSelected).getPrice() <= money)
        {
            // Switch to vending snack
            this.stateOfVendingMachine.nextState();


            // Dispense the snack
            // Use the dispense handler
            this.snackDispenser.dispenseSnack(this.snacks.get(snackSelected).getName());

            // Dispense the snack
            if(this.snacks.get(snackSelected).dispense()){
                System.out.println(this.snacks.get(snackSelected).getName() + " has been dispensed.");
            }
            else
            {
                System.out.println("No snacks left. Money refunded");
            }

            // Switch to idle
            this.stateOfVendingMachine.nextState();
        }
        else
        {
            System.out.println("Not enough money! Resetting Vending Machine");
            this.stateOfVendingMachine.reset();
        }
    }

    // Find the index of the snack
    public int findSnack(String snackName){
        for( Snack snack : this.snacks) {
            if(snack.equals(snackName)){
                return this.snacks.indexOf(snack);
            }
        }

        return -1;
    }

    // Print the Arraylist of snacks
    public String snackList(){
        StringBuilder list = new StringBuilder();

        for( Snack snack : this.snacks) {
            list.append(snack.toString()).append("\n");
        }

        return list.toString();
    }

    @Override
    public String toString() {
        return "VENDING MACHINE\nState: " + this.stateOfVendingMachine + "\nSnacks: " + this.snackList();
    }


}
