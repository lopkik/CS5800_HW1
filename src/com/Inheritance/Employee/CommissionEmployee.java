package com.Inheritance.Employee;

public class CommissionEmployee extends Employee{
    private double commissionRate;
    private double grossSalary;

    public CommissionEmployee(String firstName, String lastName, String ssn, double commissionRate, double grossSalary) {
        super(firstName, lastName, ssn);
        this.commissionRate = commissionRate;
        this.grossSalary = grossSalary;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    @Override
    public String toString() {
        return "Type: " + String.format("%-12s", "Commission") +
                " | Name: " + String.format("%-20s", this.firstName + " " + this.lastName) +
                " | Commission Rate: " + String.format("%.2f", this.commissionRate) +
                " | Gross Salary: " + String.format("%.2f", this.grossSalary);
    }
}
