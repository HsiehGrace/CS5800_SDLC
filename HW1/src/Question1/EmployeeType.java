package Question1;

public class EmployeeType {

    public static class Employee{

        private String firstName, lastName;
        private int socialSecurityNumber;

        // Constructors
        public Employee() {
            firstName = "John";
            lastName = "Smith";
            socialSecurityNumber = 111111111;
        }

        public Employee( String firstName, String lastName, int socialSecurityNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.socialSecurityNumber = socialSecurityNumber;
        }

        // Getters
        public String getFirstName(){
            return firstName;
        }

        public String getLastName(){
            return lastName;
        }

        public int getSocialSecurityNumber(){
            return socialSecurityNumber;
        }

        // Setters
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setSocialSecurityNumber(int socialSecurityNumber) {
            this.socialSecurityNumber = socialSecurityNumber;
        }


    }

    public static class SalariedEmployee extends Employee{
        private int weeklySalary;

        // Constructors
        public SalariedEmployee() {
            super();
            weeklySalary = 0;
        }

        public SalariedEmployee( String firstName, String lastName, int socialSecurityNumber) {
            super(firstName, lastName, socialSecurityNumber);
            weeklySalary = 0;
        }

        public SalariedEmployee( String firstName, String lastName, int socialSecurityNumber, int weeklySalary) {
            super(firstName, lastName, socialSecurityNumber);
            this.weeklySalary = weeklySalary;
        }

        // Getters
        public int getWeeklySalary(){
            return weeklySalary;
        }

        // Setters
        public void setWeeklySalary(int weeklySalary){
            this.weeklySalary = weeklySalary;
        }
    }

    public static class HourlyEmployee extends Employee{
        private int wage, hoursWorked;

        // Constructors
        public HourlyEmployee() {
            super();
            wage = 0;
            hoursWorked = 0;
        }

        public HourlyEmployee( String firstName, String lastName, int socialSecurityNumber) {
            super(firstName, lastName, socialSecurityNumber);
            wage = 0;
            hoursWorked = 0;
        }

        public HourlyEmployee( String firstName, String lastName, int socialSecurityNumber, int wage, int hoursWorked) {
            super(firstName, lastName, socialSecurityNumber);
            this.wage = wage;
            this.hoursWorked = hoursWorked;
        }

        // Getters
        public int getWage(){
            return wage;
        }

        public int getHoursWorked(){
            return hoursWorked;
        }

        // Setters
        public void setWage(int wage){
            this.wage = wage;
        }

        public void setHoursWorked(int hoursWorked){
            this.hoursWorked = hoursWorked;
        }
    }

    public static class CommisionEmployee extends Employee{
        private int commissionRate, grossSales;

        // Constructors
        public CommisionEmployee() {
            super();
            commissionRate = 0;
            grossSales = 0;
        }

        public CommisionEmployee( String firstName, String lastName, int socialSecurityNumber) {
            super(firstName, lastName, socialSecurityNumber);
            commissionRate = 0;
            grossSales = 0;
        }

        public CommisionEmployee( String firstName, String lastName, int socialSecurityNumber, int commissionRate, int grossSales) {
            super(firstName, lastName, socialSecurityNumber);
            this.commissionRate = commissionRate;
            this.grossSales = grossSales;
        }

        // Getters
        public int getCommissionRate(){
            return commissionRate;
        }

        public int getGrossSales(){
            return grossSales;
        }

        // Setters
        public void setCommissionRate(int commissionRate){
            this.commissionRate = commissionRate;
        }

        public void setGrossSales(int grossSales){
            this.grossSales = grossSales;
        }
    }

    public static class BaseEmployee extends Employee{
        int baseSalary;

        // Constructors
        public BaseEmployee() {
            super();
            baseSalary = 0;
        }

        public BaseEmployee( String firstName, String lastName, int socialSecurityNumber) {
            super(firstName, lastName, socialSecurityNumber);
            baseSalary = 0;
        }

        public BaseEmployee( String firstName, String lastName, int socialSecurityNumber, int baseSalary) {
            super(firstName, lastName, socialSecurityNumber);
            this.baseSalary = baseSalary;
        }

        // Getter
        public int getBaseSalary(){
            return baseSalary;
        }

        // Setter
        public void setBaseSalary(int baseSalary){
            this.baseSalary = baseSalary;
        }
    }
}