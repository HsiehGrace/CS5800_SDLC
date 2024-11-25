package Vending;

public class Snack {
    private String name;
    private double price;
    private int quantity;

    public Snack(){
        this.name = "";
        this.price = 0;
        this.quantity = 0;
    }

    public Snack(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    public Snack(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void addQuantity(int quantity){
        this.quantity += quantity;
    }

    public boolean dispense(){
        if( this.quantity <= 0 )
        {
            return false;
        }
        else
        {
            this.quantity -= 1;
        }

        return true;
    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }

        if (!(o instanceof String)){
            return false;
        }

        return this.name.equals(o);
    }

    @Override
    public String toString(){
        return this.name + ", $" + this.price + ", Quantity: " + this.quantity;
    }

}
