package org.basics.employeewages;

import java.util.Random;

public class EmployeeAttendance {
    public static void main(String[] args) {
        Random random = new Random();
        int attendanceStatus = random.nextInt(2);
        if (attendanceStatus == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
