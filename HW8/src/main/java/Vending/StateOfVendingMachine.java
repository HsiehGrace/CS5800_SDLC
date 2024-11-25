package Vending;

public class StateOfVendingMachine {
    private int currentState;

    StateOfVendingMachine() {
        currentState = 0;
    }

    public boolean checkState(int state){
        if (state == currentState){
            return true;
        }
        else
        {
            System.out.println("Invalid Action - Current State: " + this);
            return false;
        }
    }

    public void nextState() {
        currentState++;
        if (this.toString().equals("ERROR")){
            currentState = 0;
        }
    }

    public void reset(){
        currentState = 0;
    }

    @Override
    public String toString(){
        return switch (currentState) {
            case 0 -> "IDLE";
            case 1 -> "ACCEPTING MONEY";
            case 2 -> "DISPENSING SNACK";
            default -> "ERROR";
        };
    }
}
