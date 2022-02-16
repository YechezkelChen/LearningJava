package com.yechezkel;

import java.util.InputMismatchException;

public class HourlyEmployee extends Employee {

    private int hours;
    private float wage;

    public HourlyEmployee(String firstName, String lastName, int id, int hours, float wage) {
        super(firstName, lastName, id);
        if(hours < 0) throw new InputMismatchException("ERROR: Hours must to be positive number");
        this.hours = hours;
        if(wage < 0) throw new InputMismatchException("ERROR: Wage must to be positive number");
        this.wage = wage;
    }

    public HourlyEmployee() {
        super();
        this.hours = 0;
        this.wage = 0;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours < 0) throw new InputMismatchException("ERROR: Hours must to be positive number");
        this.hours = hours;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        if(wage < 0) throw new InputMismatchException("ERROR: Wage must to be positive number");
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hours=" + hours +
                ", wage=" + wage +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        HourlyEmployee that = (HourlyEmployee) o;
        return hours == that.hours && Float.compare(that.wage, wage) == 0;
    }

    /**
     * Calculate salary
     *
     * @return
     */
    @Override
    public double earnings() {
        return hours * wage;
    }
}
