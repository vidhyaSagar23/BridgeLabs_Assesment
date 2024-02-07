package org.basics.employeewages;

public class WagesForMonth {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int fullDayHours = 8;

        int perDayWage=wagePerHour*fullDayHours;

        int wagePerMonth=20*perDayWage;

        System.out.println(wagePerMonth);
    }
}
