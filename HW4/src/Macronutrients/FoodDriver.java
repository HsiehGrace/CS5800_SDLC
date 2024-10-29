package Macronutrients;

public class FoodDriver {
    public static void main(String[] args) {

        // Retrieve the abstract factory
        FoodFactory.Macronutrient factory = FoodFactory.getMacronutrientFactory();

        // Set up all 6 People
        Diet person1 = new Diet("Sage", "None");
        Diet person2 = new Diet("Phoenix", "Paleo");
        Diet person3 = new Diet("Cypher", "Paleo");
        Diet person4 = new Diet("Brimstone", "Vegan");
        Diet person5 = new Diet("Neon", "Nut Allergy");
        Diet person6 = new Diet("Reyna", "Nut Allergy");

        // Get Diets Based on Plan
        person1.setDietPlan(factory.getDiet(person1.dietPlan));
        person2.setDietPlan(factory.getDiet(person2.dietPlan));
        person3.setDietPlan(factory.getDiet(person3.dietPlan));
        person4.setDietPlan(factory.getDiet(person4.dietPlan));
        person5.setDietPlan(factory.getDiet(person5.dietPlan));
        person6.setDietPlan(factory.getDiet(person6.dietPlan));

        // Print out Diets
        person1.printDiet();
        person2.printDiet();
        person3.printDiet();
        person4.printDiet();
        person5.printDiet();
        person6.printDiet();

    }

    public static class Diet{
        public String customerName;
        public String dietPlan;
        public String carb;
        public String protein;
        public String fats;

        Diet(String customerName, String dietPlan)
        {
            this.customerName = customerName;
            this.dietPlan = dietPlan;
        }

        public void setDietPlan(String[] diet)
        {
            this.carb = diet[0];
            this.protein = diet[1];
            this.fats = diet[2];
        }

        public void printDiet()
        {
            System.out.println("Name:\t\t" + this.customerName);
            System.out.println("Diet Plan:\t" + this.dietPlan);
            System.out.println("Carb:\t\t" + this.carb);
            System.out.println("Protein:\t" + this.protein);
            System.out.println("Fat:\t\t" + this.fats);
            System.out.println();
        }
    }
}
