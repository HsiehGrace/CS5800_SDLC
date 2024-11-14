package Restaurant;

import Restaurant.FoodBuilder.*;

public class Main {
    public static void main(String[] args) {
        Food hotDog = new BaseFood("Hot Dog", 1.03);
        Food hotDog_m = new Topping(hotDog,"Mustard", 0.05);
        Food hotDog_m_k = new Topping(hotDog_m, "Ketchup", 0.01);

        Food hotDog_chili_mustard = new Topping(hotDog_m, "Chili Mustard", 0.05);
        Food burger = new BaseFood("Burger", 3.05);

        Order myOrder = new Order();

        myOrder.addFood(hotDog);
        myOrder.addFood(hotDog_m);
        myOrder.addFood(hotDog_m_k);
        System.out.println(myOrder.printOrder());
        System.out.println("Cost: $" + myOrder.totalCost());

        myOrder.addFood(burger);
        System.out.println(myOrder.printOrder());
        System.out.println("Cost: $" + myOrder.totalCost());

        Loyalty customer = new Loyalty("Gold");
        System.out.println("Gold Customer Discounted Price: $" + customer.Discount(myOrder.totalCost()));

    }
}