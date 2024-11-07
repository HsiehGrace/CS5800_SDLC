package Restaurant;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import Restaurant.FoodBuilder.*;

class OrderTest extends Order {

    Order testOrder;
    Food testFoodOne;
    Food testFoodTwo;

    @BeforeEach
    void setUp() {
        testOrder = new Order();
        testFoodOne = new BaseFood("Hot Dog", 1.03);
        testFoodTwo = new BaseFood("Chicken", 2.99);
    }

    @Test
    void testTotalCosts() {
        testOrder.addFood(testFoodOne);
        assertEquals(testOrder.totalCost(), 1.03);
        testOrder.addFood(testFoodTwo);
        assertEquals(testOrder.totalCost(), 4.02);
    }

    @Test
    void testPrintOrder() {
        assertEquals(testOrder.printOrder(),"No food");
        testOrder.addFood(testFoodOne);
        assertEquals(testOrder.printOrder(),"\nHot Dog");
        testOrder.addFood(testFoodTwo);
        assertEquals(testOrder.printOrder(),"\nHot Dog\nChicken");
    }

}