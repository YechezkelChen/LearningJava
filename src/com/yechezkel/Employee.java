package com.yechezkel;

import java.util.InputMismatchException;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private int id;

    public Employee(String firstName, String lastName, int id) {
        if(firstName == "") throw new InputMismatchException("ERROR: First name must contain value");
        this.firstName = firstName;
        if(lastName == "") throw new InputMismatchException("ERROR: Last name must contain value");
        this.lastName = lastName;
        if(id <= 0) throw new InputMismatchException("ERROR: ID name must to be positive number");
        this.id = id;
    }

    public Employee() {
        this("plony", "almony", 0);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName == "") throw new InputMismatchException("ERROR: First name must contain value");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName == "") throw new InputMismatchException("ERROR: Last name must contain value");
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id <= 0) throw new InputMismatchException("ERROR: ID name must to be positive number");
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return id == employee.id;
    }

    /**
     * Calculate salary
     * @return
     */
    public abstract double earnings();
}
