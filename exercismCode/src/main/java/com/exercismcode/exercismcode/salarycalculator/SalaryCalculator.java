package com.exercismcode.exercismcode.salarycalculator;

public class SalaryCalculator {

    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped < 5 ? 1.0 : 0.85;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salaryBase = 1000.00;
        double finalSalary = salaryBase *  salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        return Math.min(finalSalary, 2000.00);
    }
}
