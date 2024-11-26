package Vending;

public class StateOfVendingMachine {
    private int currentState;

    StateOfVendingMachine() {
        currentState = 0;
    }

    public boolean checkState(int state){
        if (this.currentState == state){
            return true;
        }
        else
        {
            System.out.println("Invalid Action - Current State: " + this + " | "
                    + state + " " + this.currentState);
            return false;
        }
    }

    public void nextState() {
        this.currentState = this.currentState + 1;
        if (this.toString().equals("ERROR")){
            this.currentState = 0;
        }
    }

    public void reset(){
        currentState = 0;
    }

    @Override
    public String toString(){
        return switch (this.currentState) {
            case 0 -> "IDLE";
            case 1 -> "ACCEPTING MONEY";
            case 2 -> "DISPENSING SNACK";
            default -> "ERROR";
        };
    }
}
