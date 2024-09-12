package com.Inheritance.Employee;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary) {
        super(firstName, lastName, ssn);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return "Type: " + String.format("%-12s", "Salary") +
                " | Name: " + String.format("%-20s", this.firstName + " " + this.lastName) +
                " | Weekly Salary: " + String.format("%.2f", this.weeklySalary);
    }
}
