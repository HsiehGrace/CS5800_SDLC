package CS5800_SDLC;

import Restaurant.Restaurant;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest extends Restaurant {

    private Food hotDog;

    @BeforeEach
    void setUp() {
        hotDog = new Restaurant.BaseFood("Hot Dog", 1.03);
    }

    @Test
    void baseFood_getDescription() {
        assertEquals(hotDog.getDescription(), "Hot Dog");
    }

    @AfterEach
    void tearDown() {
    }
}