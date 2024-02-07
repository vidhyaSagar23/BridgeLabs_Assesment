package org.basics.employeewages;

public class WageTillDay {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int hour=0;
        int wage=1;
        while(hour<=100){
            wage=hour*wagePerHour;
            hour++;
        }
        System.out.println(wage);
    }
}
