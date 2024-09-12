package com.Polymorphism.Ship;

public class CruiseShip extends Ship{
    private int passengerCapacity;

    public CruiseShip(String name, String buildYear, int maxPassengerCapacity) {
        super(name, buildYear);
        this.passengerCapacity = maxPassengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void printShip() {
        System.out.println(this.name + " -> Passenger Capacity: " + this.passengerCapacity);
    }
}
