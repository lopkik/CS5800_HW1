package com.Polymorphism.Ship;

public class CargoShip extends Ship{
    private int cargoTonnageCapacity;

    public CargoShip(String name, String buildYear, int cargoTonnageCapacity) {
        super(name, buildYear);
        this.cargoTonnageCapacity = cargoTonnageCapacity;
    }

    public int getCargoTonnageCapacity() {
        return cargoTonnageCapacity;
    }

    public void setCargoTonnageCapacity(int cargoTonnageCapacity) {
        this.cargoTonnageCapacity = cargoTonnageCapacity;
    }

    @Override
    public void printShip() {
        System.out.println(this.name + " -> Cargo Tonnage Capacity: " + this.cargoTonnageCapacity);
    }
}
