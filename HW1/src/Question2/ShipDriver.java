package Question2;
import Question2.ShipType.*;

public class ShipDriver {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("ShipOne", 1111);
        ships[1] = new CruiseShip("ShipTwo", 2222, 500);
        ships[2] = new CargoShip("ShipThree", 3333, 1000);

        for (Ship currentShip : ships) {
            currentShip.printShip();
        }

    }
}
