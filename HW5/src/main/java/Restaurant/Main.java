package Restaurant;

import Restaurant.FoodBuilder.*;

public class Main {
    public static void main(String[] args) {
        BaseFood hotDog = new BaseFood("Hot Dog", 1.03);
        Topping hotDog_m = new Topping(hotDog,"Mustard", 0.05);
        Topping hotDog_m_k = new Topping(hotDog_m, "Ketchup", 0.01);

        Order myOrder = new Order();

        myOrder.addFood(hotDog);
        myOrder.addFood(hotDog_m);
        myOrder.addFood(hotDog_m_k);

        myOrder.printOrder();
        System.out.println("Cost: $" + myOrder.totalCost());
    }
}