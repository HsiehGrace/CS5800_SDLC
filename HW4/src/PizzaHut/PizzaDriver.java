package PizzaHut;

import java.util.ArrayList;
import java.util.Random;
import PizzaHut.PizzaClass.*;


public class PizzaDriver {

    public static final String[] validToppings = {
            "Pepperoni",
            "Sausage",
            "Mushrooms",
            "Bacon",
            "Onions",
            "Extra Cheese",
            "Peppers",
            "Chicken",
            "Olives",
            "Spinach",
            "Tomato and Basil",
            "Beef",
            "Ham",
            "Pesto",
            "Spicy Pork",
            "Ham and Pineapple"
    };

    public static void main(String[] args) {

        System.out.println("========== QUESTION 1 - Different Number of Toppings ==========");
        // Builder design means can set in any order
        Pizza firstPizza = new PizzaBuilder().setPizzaChain("Pizza Hut").setSize("Small").setToppings(randToppings(3)).createPizza();
        Pizza secondPizza = new PizzaBuilder().setPizzaChain("Pizza Hut").setSize("Small").setToppings(randToppings(6)).createPizza();
        Pizza thirdPizza = new PizzaBuilder().setPizzaChain("Pizza Hut").setSize("Small").setToppings(randToppings(9)).createPizza();

        firstPizza.eat();
        secondPizza.eat();
        thirdPizza.eat();

        System.out.println("========== QUESTION 2 - Lots of Pizzas ==========");
        Pizza phut1 = new PizzaBuilder().setPizzaChain("Pizza Hut").setSize("Large").setToppings(randToppings(3)).createPizza();
        Pizza phut2 = new PizzaBuilder().setPizzaChain("Pizza Hut").setSize("Small").setToppings(randToppings(2)).createPizza();

        Pizza caesar1 = new PizzaBuilder().setPizzaChain("Little Caesars").setSize("Medium").setToppings(randToppings(8)).createPizza();
        Pizza caesar2 = new PizzaBuilder().setPizzaChain("Little Caesars").setSize("Small").setToppings(randToppings(6)).createPizza();

        Pizza domino1 = new PizzaBuilder().setPizzaChain("Dominos").setSize("Small").setToppings(randToppings(1)).createPizza();
        Pizza domino2 = new PizzaBuilder().setPizzaChain("Dominos").setSize("Large").setToppings(randToppings(3)).createPizza();

        phut1.eat();
        phut2.eat();
        caesar1.eat();
        caesar2.eat();
        domino1.eat();
        domino2.eat();
    }

    // Set up random
    public static Random rand = new Random();

    // Get a number of toppings in an array list from list of valid toppings
    public static ArrayList<String> randToppings(int numToppings)
    {
        ArrayList<String> toppings = new ArrayList<>();

        for (int i = 0; i < numToppings; i++) {
            toppings.add(validToppings[rand.nextInt(validToppings.length)]);
        }

        return toppings;
    }
}
