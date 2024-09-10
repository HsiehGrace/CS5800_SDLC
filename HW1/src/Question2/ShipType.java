package Question2;

public class ShipType {

    public static class Ship{
        String name;
        int yearBuilt;

        // Constructors
        public Ship(){
            name = "Ship";
            yearBuilt = 0;
        }

        public Ship(String name, int yearBuilt){
            this.name = name;
            this.yearBuilt = yearBuilt;
        }

        // Getters
        public String getName(){
            return name;
        }

        public int getYearBuilt(){
            return yearBuilt;
        }

        // Setters
        public void setName(String name){
            this.name = name;
        }

        public void setYearBuilt(int yearBuilt){
            this.yearBuilt = yearBuilt;
        }

        public void printShip(){
            System.out.println("Name: " + name + " YearBuilt: " + yearBuilt);
        }
    }

    public static class CruiseShip extends Ship{
        private int passengers;

        // Constructors
        public CruiseShip(){
            passengers = 0;
        }

        public CruiseShip(String name, int yearBuilt){
            super(name, yearBuilt);
            passengers = 0;
        }

        public CruiseShip(String name, int yearBuilt, int passengers){
            super(name, yearBuilt);
            this.passengers = passengers;
        }

        // Getters
        public int getPassengers(){
            return passengers;
        }

        // Setters
        public void setPassengers(int passengers){
            this.passengers = passengers;
        }

        public void printShip(){
            System.out.println("Name: " + name + " Passengers: " + passengers);
        }
    }

    public static class CargoShip extends Ship{
        int cargoCapcity;

        // Constructors
        public CargoShip(){
            cargoCapcity = 0;
        }

        public CargoShip(String name, int yearBuilt){
            super(name, yearBuilt);
            cargoCapcity = 0;
        }

        public CargoShip(String name, int yearBuilt, int cargoCapcity){
            super(name, yearBuilt);
            this.cargoCapcity = cargoCapcity;
        }

        // Getters
        public int getCargoCapcity(){
            return cargoCapcity;
        }

        // Setters
        public void setCargoCapcity(int cargoCapcity){
            this.cargoCapcity = cargoCapcity;
        }

        public void printShip(){
            System.out.println("Name: " + name + " CargoCapcity: " + cargoCapcity);
        }
    }
}
