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

    public String printOrder(){

        if (foodList.isEmpty()){
            return "No food";
        }

        String fullOrder = "";
        for (Food food : foodList){
            fullOrder += "\n" + food.getDescription();
        }

        return fullOrder;
    }

    public double totalCost(){
        double total = 0;

        for (Food food : foodList){
            total += food.getCost();
        }

        // Rounding Double to two decimals
        return (double)Math.round(total * 100d) / 100d;
    }
}
