package PizzaHut;

import java.util.ArrayList;

public class PizzaClass {

    public static class PizzaBuilder {
        public String pizzaChain;
        public String size;
        public ArrayList<String> toppings;

        // Default Constructor
        PizzaBuilder(){
            this.size = "Small";                    // Default Size
            this.toppings = new ArrayList<>();      // Setup ArrayList
        }

        public PizzaBuilder setPizzaChain(String pizzaChain) {
            this.pizzaChain = pizzaChain;
            return this;
        }

        public PizzaBuilder setSize(String size) {
            this.size = size;
            return this;
        }

        public PizzaBuilder setToppings(ArrayList<String> toppings) {
            this.toppings = toppings;
            return this;
        }

        // Final Build Call
        public Pizza createPizza() {
            return new Pizza(this.pizzaChain, this.size, this.toppings);
        }

    }

    public static class Pizza {
        private final String pizzaChain;
        private final String size;
        private final ArrayList<String> toppings;

        // Constructor
        Pizza(String pizzaChain, String size, ArrayList<String> toppings) {
            this.pizzaChain = pizzaChain;
            this.size = size;
            this.toppings = toppings;
        }

        // Print Method
        public void eat(){
            System.out.println("Pizza Chain: " + this.pizzaChain);
            System.out.println("Pizza Size: " + this.size);
            System.out.println("Number of Toppings: " + this.toppings.size());
            System.out.println("Toppings: " + this.toppings);
            System.out.println();
        }
    }
}
