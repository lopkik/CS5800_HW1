package com.Inheritance;

import com.Inheritance.Employee.*;

public class EmployeeDriver {
    public static void main (String[] args) {
        Employee joe = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500.00);
        Employee stephanie = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25.00, 19);
        Employee mary = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19.00, 47);
        Employee nicole = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 15.00, 50000.00);
        Employee renwa = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700.00);
        Employee mike = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000.00);
        Employee mahnaz = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22.00, 40000.00);

        Employee[] employees = {joe, stephanie, mary, nicole, renwa, mike, mahnaz};

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
