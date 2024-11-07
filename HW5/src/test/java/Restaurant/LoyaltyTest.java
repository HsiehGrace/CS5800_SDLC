package Restaurant;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoyaltyTest extends Loyalty {

    double value;
    Loyalty goldCustomer;
    Loyalty silverCustomer;
    Loyalty bronzeCustomer;
    Loyalty basicCustomer;

    @BeforeEach
    void setUp() {
        value = 100.00;
        goldCustomer = new Loyalty("Gold");
        silverCustomer = new Loyalty("Silver");
        bronzeCustomer = new Loyalty("Bronze");
        basicCustomer = new Loyalty();
    }

    @Test
    void discount() {
        assertEquals(goldCustomer.Discount(value), 50);
        assertEquals(silverCustomer.Discount(value), 75);
        assertEquals(bronzeCustomer.Discount(value), 95);
        assertEquals(basicCustomer.Discount(value), 100);
    }
}