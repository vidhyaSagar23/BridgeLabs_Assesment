package org.basics.employeewages;

public class PartTime {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int fullDayHours = 8;
        int dailyWage = wagePerHour * fullDayHours;
        int partTime=dailyWage/2;
        System.out.println("Daily Wage: " + dailyWage);
        System.out.println("Daily part time Wage: " + partTime);


    }
}
