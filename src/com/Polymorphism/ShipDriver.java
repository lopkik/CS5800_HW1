package com.Polymorphism;

import com.Polymorphism.Ship.Ship;
import com.Polymorphism.Ship.CruiseShip;
import com.Polymorphism.Ship.CargoShip;

public class ShipDriver {
    public static void main(String[] args) {
        Ship classic = new Ship("HMS Classic", "1920");
        Ship party = new CruiseShip("SS Caribbean Party", "2004", 50000);
        Ship tugboat = new CargoShip("Tugboat", "1840", 1);
        Ship[] ships = {classic, party, tugboat};

        for (Ship ship : ships) {
            ship.printShip();
        }
    }
}
