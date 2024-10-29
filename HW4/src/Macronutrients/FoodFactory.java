package Macronutrients;

import java.util.Random;

public class FoodFactory {

    public static Random rand = new Random();

    // Singleton Instantiations
    private static Carbs carbFactory = null;
    private static Protein proteinFactory = null;
    private static Fats fatFactory = null;
    public static Macronutrient macronutrientFactory = null;

    public static Carbs getCarbFactory() {
        if(carbFactory == null) {
            carbFactory = new Carbs();
        }
        return carbFactory;
    }

    public static Protein getProteinFactory() {
        if(proteinFactory == null) {
            proteinFactory = new Protein();
        }
        return proteinFactory;
    }

    public static Fats getFatFactory(){
        if(fatFactory == null) {
            fatFactory = new Fats();
        }
        return fatFactory;
    }

    public static Macronutrient getMacronutrientFactory() {
        if(macronutrientFactory == null) {
            macronutrientFactory = new Macronutrient();
        }
        return macronutrientFactory;
    }


    // Singleton Factory
    public static class Carbs {
        private Carbs() {}

        public String[] allFood = {
                "Cheese",
                "Bread",
                "Lentils",
                "Pistachio"
        };

        public String[] paleoFood = {
                "Pistachio"
        };

        public String[] veganFood = {
                "Bread",
                "Lentils",
                "Pistachio"
        };

        public String[] nutAllergyFood = {
                "Cheese",
                "Bread",
                "Lentils"
        };
    }


    // Singleton Factory
    public static class Protein{
        private Protein(){}

        public String[] allFood = {
                "Fish",
                "Chicken",
                "Beef",
                "Tofu"
        };

        public String[] paleoFood = {
                "Fish",
                "Chicken",
                "Beef"
        };

        public String[] veganFood = {
                "Beef",
                "Tofu"
        };

        public String[] nutAllergyFood = allFood;

    }

    // Singleton Factory
    public static class Fats{
        private Fats(){}

        public String[] allFood = {
                "Avocado",
                "Sour Cream",
                "Tuna",
                "Peanuts"
        };

        public String[] paleoFood = {
                "Avocado",
                "Tuna",
                "Peanuts"
        };

        public String[] veganFood = {
                "Avocado",
                "Peanuts"
        };

        public String[] nutAllergyFood = {
                "Avocado",
                "Sour Cream",
                "Tuna"
        };
    }

    // Singleton Abstract Factory
    public static class Macronutrient{
        public String[] diet;
        Carbs carbs;
        Protein protein;
        Fats fats;

        private Macronutrient(){
            this.diet = new String[]{"Carb", "Protein", "Fat"}; // Default
            carbs = getCarbFactory();
            protein = getProteinFactory();
            fats = getFatFactory();
        }

        public String[] getDiet(String Diet)
        {
            switch (Diet) {
                case "Paleo":
                    diet[0] = carbs.paleoFood[rand.nextInt(carbs.paleoFood.length)];
                    diet[1] = protein.paleoFood[rand.nextInt(protein.paleoFood.length)];
                    diet[2] = fats.paleoFood[rand.nextInt(fats.paleoFood.length)];
                    break;

                case "Vegan":
                    diet[0] = carbs.veganFood[rand.nextInt(carbs.veganFood.length)];
                    diet[1] = protein.veganFood[rand.nextInt(protein.veganFood.length)];
                    diet[2] = fats.veganFood[rand.nextInt(fats.veganFood.length)];
                    break;

                case "Nut Allergy":
                    diet[0] = carbs.nutAllergyFood[rand.nextInt(carbs.nutAllergyFood.length)];
                    diet[1] = protein.nutAllergyFood[rand.nextInt(protein.nutAllergyFood.length)];
                    diet[2] = fats.nutAllergyFood[rand.nextInt(fats.nutAllergyFood.length)];
                    break;

                default:
                    diet[0] = carbs.allFood[rand.nextInt(carbs.allFood.length)];
                    diet[1] = protein.allFood[rand.nextInt(protein.allFood.length)];
                    diet[2] = fats.allFood[rand.nextInt(fats.allFood.length)];
                    break;
            }

            return diet;
        }
    }
}
