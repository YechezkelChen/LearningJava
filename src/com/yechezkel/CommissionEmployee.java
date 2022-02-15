package com.yechezkel;

import java.util.InputMismatchException;

public class CommissionEmployee extends Employee{

    private float grossSales;
    private int commission;

    public CommissionEmployee(String firstName, String lastName, int id, float grossSales, int commission) {
        super(firstName, lastName, id);
        if(grossSales < 0) throw new InputMismatchException("ERROR: Gross sales must to be positive number");
        this.grossSales = grossSales;
        if(commission < 0) throw new InputMismatchException("ERROR: Commission must to be positive number");
        this.commission = commission;
    }

    public CommissionEmployee() {
        super();
        this.grossSales = 0;
        this.commission = 0;
    }

    public float getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(float grossSales) {
        if(grossSales < 0) throw new InputMismatchException("ERROR: Gross sales must to be positive number");
        this.grossSales = grossSales;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        if(commission < 0) throw new InputMismatchException("ERROR: Commission must to be positive number");
        this.commission = commission;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "grossSales=" + grossSales +
                ", commission=" + commission +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CommissionEmployee that = (CommissionEmployee) o;

        if (Float.compare(that.grossSales, grossSales) != 0) return false;
        return commission == that.commission;
    }

    /**
     * Calculate salary
     *
     * @return
     */
    @Override
    public double earnings() {
        return grossSales * (commission / 100.0);
    }
}
