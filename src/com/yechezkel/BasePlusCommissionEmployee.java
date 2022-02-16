package com.yechezkel;

import java.util.InputMismatchException;

public class BasePlusCommissionEmployee extends CommissionEmployee  {
    private float baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, int id, float grossSales, int commission, float baseSalary) {
        super(firstName, lastName, id, grossSales, commission);
        if(baseSalary < 0) throw new InputMismatchException("ERROR: Base salary must to be positive number");
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee() {
        super();
        this.baseSalary = 0;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        if(baseSalary < 0) throw new InputMismatchException("ERROR: Base salary must to be positive number");
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" +
                "baseSalary=" + baseSalary +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BasePlusCommissionEmployee that = (BasePlusCommissionEmployee) o;
        return Float.compare(that.baseSalary, baseSalary) == 0;
    }

    /**
     * Calculate salary
     *
     * @return
     */
    @Override
    public double earnings() {
        return this.baseSalary + super.earnings();
    }

}
