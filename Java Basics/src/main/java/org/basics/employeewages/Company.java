package org.basics.employeewages;

public class Company {
    private int wage;
    private int workingDays;
    private int workingHoursPerMonth;

    public Company() {
    }

    public Company(int wage, int workingDays, int workingHoursPerMonth) {
        this.wage = wage;
        this.workingDays = workingDays;
        this.workingHoursPerMonth = workingHoursPerMonth;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

    public int getWorkingHoursPerMonth() {
        return workingHoursPerMonth;
    }

    public void setWorkingHoursPerMonth(int workingHoursPerMonth) {
        this.workingHoursPerMonth = workingHoursPerMonth;
    }

    @Override
    public String toString() {
        return "Company{" +
                "wage=" + wage +
                ", workingDays=" + workingDays +
                ", workingHoursPerMonth=" + workingHoursPerMonth +
                '}';
    }
}
