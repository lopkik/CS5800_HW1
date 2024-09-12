package com.Polymorphism.Ship;

public class Ship {
    protected String name;
    protected String buildYear;

    public Ship(String name, String buildYear) {
        this.name = name;
        this.buildYear = buildYear;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final String getBuildYear() {
        return buildYear;
    }

    public final void setBuildYear(String buildYear) {
        this.buildYear = buildYear;
    }

    public void printShip() {
        System.out.println(this.name + " -> Build year: " + this.buildYear);
    }
}
