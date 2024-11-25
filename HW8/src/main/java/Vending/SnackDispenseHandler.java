package Vending;

public class SnackDispenseHandler {
    int snackID;
    SnackDispenseHandler nextSnack;
    String snackName;

    SnackDispenseHandler(){
        this.snackID = 0;
        this.snackName = null;
        this.nextSnack = null;
    }

    SnackDispenseHandler(String snack, int snackID){
        this.snackID = snackID;
        this.snackName = snack;
        nextSnack = null;
    }

    public void newSnack(String snack){
        if(this.snackName == null){
            this.snackName = snack;
        }

        if(this.nextSnack == null){
            this.nextSnack = new SnackDispenseHandler(snack, this.snackID + 1);
        }
        else
        {
            this.nextSnack.newSnack(snack);
        }
    }

    public boolean dispenseSnack(String snack){

        if(this.snackName.equals(snack)){
            return true;
        }

        if(this.nextSnack != null)
        {
            return this.nextSnack.dispenseSnack(snack);
        }

        return false;
    }

}
