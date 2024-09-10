package Question1;
import Question1.EmployeeType.*;

public class EmployeeDriver {
    public static void main(String[] args) {

        SalariedEmployee Joe =
                new SalariedEmployee(
                        "Joe", "Jones", 111111111,
                        2500);

        HourlyEmployee Stephanie =
                new HourlyEmployee("Stephanie", "Smith", 222222222,
                        25, 32);

        HourlyEmployee Mary =
                new HourlyEmployee("Mary", "Quinn", 333333333,
                        19, 47);

        CommisionEmployee Nicole =
                new CommisionEmployee("Nicole", "Dior", 444444444,
                        15, 50000);

        SalariedEmployee Renwa =
                new SalariedEmployee("Renwa", "Chanel", 555555555,
                        1700);

        BaseEmployee Mike =
                new BaseEmployee("Mike", "Davenport", 666666666,
                        95000);

        CommisionEmployee Mahnaz =
                new CommisionEmployee("Mahnaz", "Vaziri", 777777777,
                        22,40000);
    }
}
