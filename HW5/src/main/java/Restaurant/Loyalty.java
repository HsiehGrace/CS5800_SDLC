package Restaurant;

public class Loyalty {

    // Assume Gold, Silver, Bronze, None
    private final String loyalty;

    Loyalty() {
        loyalty = "Basic";
    }

    // In a real situation, check for spelling etc
    Loyalty(String loyalty) {
        this.loyalty = loyalty;
    }

    public double Discount(double cost){

        double newCost = cost;

        switch (loyalty) {
            case "Gold":
                newCost *= 0.5;
                break;
            case "Silver":
                newCost *= 0.75;
                break;
            case "Bronze":
                newCost *= 0.95;
                break;
            default:
                break;
        }

        // Rounding double to two decimal places
        return (double)Math.round(newCost * 100d) / 100d;
    }
}
