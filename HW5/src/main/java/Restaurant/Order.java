package Restaurant;

import Restaurant.FoodBuilder.*;
import java.util.ArrayList;

public class Order {
    ArrayList<Food> foodList;

    // Default Constructor
    Order(){
        foodList = new ArrayList<>();
    }

    // Copy Constructor
    Order(ArrayList<Food> foodList) {
        this.foodList = foodList;
    }

    public void addFood(Food food){
        foodList.add(food);
    }

    public void printOrder(){
        for (Food food : foodList){
            System.out.println(food.getDescription());
        }
    }

    public double totalCost(){
        double total = 0;

        for (Food food : foodList){
            total += food.getCost();
        }

        return total;
    }
}
