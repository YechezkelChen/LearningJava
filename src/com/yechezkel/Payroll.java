/**
 * Yechezkel Chen
 * 325191419
 */

package com.yechezkel;

import java.util.InputMismatchException;

public class Payroll {

    public static void main(String[] args) {
        System.out.println("Hello Java");
        Employee[] Employees = new Employee[3];
        try {
            Employees[0] = new HourlyEmployee("Avraham", "Cohen", 12345, 40, (float) 50.455);
            Employees[1] = new CommissionEmployee("Isaac", "Levi", 54321, 5000, 10);
            Employees[2] = new BasePlusCommissionEmployee("Jacob", "Chen", 67890, 4000, 15, 1500);
            for (int i = 0; i < Employees.length; i++) {
                System.out.println(Employees[i].toString());
                if (Employees[i] instanceof BasePlusCommissionEmployee)
                    System.out.println(String.format("%.2f", Employees[i].earnings() + 0.1 * Employees[i].earnings()));
                else
                    System.out.println(String.format("%.2f", Employees[i].earnings()));
            }
        }
        catch (InputMismatchException ex){
            System.out.println(ex.getMessage());
        }
    }
}
