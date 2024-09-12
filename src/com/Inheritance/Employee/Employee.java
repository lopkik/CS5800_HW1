package com.Inheritance.Employee;

public abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected String ssn;

    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public final void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public final String getLastName() {
        return lastName;
    }

    public final void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public final String getSsn() {
        return ssn;
    }

    public abstract String toString();
}
