package com.Inheritance.Employee;

public class BaseEmployee extends Employee{
    private double baseSalary;

    public BaseEmployee(String firstName, String lastName, String ssn, double baseSalary) {
        super(firstName, lastName, ssn);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "Type: " + String.format("%-12s", "Base") +
                " | Name: " + String.format("%-20s", this.firstName + " " + this.lastName) +
                " | Base Salary: " + String.format("%.2f", this.baseSalary);
    }
}
