package Restaurant;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodBuilderTest extends FoodBuilder {

    private Food hotDog;
    private Food hotDog_m;
    private Food hotDog_mk;

    @BeforeEach
    void setUp() {
        hotDog = new BaseFood("Hot Dog", 1.03);
        hotDog_m = new Topping(hotDog, "Mustard", 0.05);
        hotDog_mk = new Topping(hotDog_m, "Ketchup", 0.01);
    }

    @Test
    void baseFood_getDescription() {
        assertEquals(hotDog.getDescription(), "Hot Dog");
    }

    @Test
    void baseFood_getCost(){
        assertEquals(hotDog.getCost(), 1.03);
    }

    @Test
    void topping_getDescription() {
        assertEquals(hotDog_m.getDescription(), "Hot Dog, Mustard");
    }

    @Test
    void topping_getCost(){
        assertEquals(hotDog_m.getCost(), 1.08);
    }

    @Test
    void twoToppings_getDescription() {
        assertEquals(hotDog_mk.getDescription(), "Hot Dog, Mustard, Ketchup");
    }

    @Test
    void twoToppings_getCost(){
        assertEquals(hotDog_mk.getCost(), 1.09);
    }

    @AfterEach
    void tearDown() {
    }
}