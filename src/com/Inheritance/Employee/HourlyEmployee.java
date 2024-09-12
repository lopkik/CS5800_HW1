package com.Inheritance.Employee;

public class HourlyEmployee extends Employee{
    public double wage;
    public int hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String ssn, double wage, int hoursWorked) {
        super(firstName, lastName, ssn);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "Type: " + String.format("%-12s", "Hourly") +
                " | Name: " + String.format("%-20s", this.firstName + " " + this.lastName) +
                " | Wage: " + String.format("%.2f", this.wage) +
                " | Hours Worked: " + String.format("%d", this.hoursWorked);
    }
}
