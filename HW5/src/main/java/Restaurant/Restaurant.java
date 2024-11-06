package Restaurant;

public class Restaurant {

    public interface Food {
        String getDescription();
        double getCost();
    }

    // "Plain" Food Object
    public static class BaseFood implements Food {
        String baseName;
        double basePrice;

        public BaseFood(String name, double price) {
            this.baseName = name;
            this.basePrice = price;
        }

        @Override
        public String getDescription() {
            return this.baseName;
        }

        @Override
        public double getCost() {
            return basePrice;
        }
    }

    // Decorator
    public static class FoodDecorator implements Food {
        protected Food decoratedFood;

        FoodDecorator(Food decoratedFood) {
            this.decoratedFood = decoratedFood;
        }

        @Override
        public String getDescription() {
            return decoratedFood.getDescription();
        }

        @Override
        public double getCost() {
            return decoratedFood.getCost();
        }
    }

    // Toppings
    public static class Topping extends FoodDecorator {
        public String toppingName;
        public double toppingPrice;

        public Topping(Food decoratedFood, String toppingName, double toppingPrice) {
            super(decoratedFood);
            this.toppingName = toppingName;
            this.toppingPrice = toppingPrice;
        }

        @Override
        public String getDescription() {
            return decoratedFood.getDescription() + ", " + toppingName;
        }

        @Override
        public double getCost() {
            return decoratedFood.getCost() + toppingPrice;
        }
    }
}
