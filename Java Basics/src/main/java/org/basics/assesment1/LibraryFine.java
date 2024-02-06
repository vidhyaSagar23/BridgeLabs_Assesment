package org.basics.assesment1;

import java.util.Scanner;

public class LibraryFine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of days the book is overdue: ");
        int daysOverdue = sc.nextInt();
        double fine = 0;

        if (daysOverdue <= 7) {
            fine = 0;
        } else {
            fine = (daysOverdue - 7) * 0.50;
        }

        if (fine == 0) {
            System.out.println("No fine. The book is within the due date.");
        } else {
            System.out.println("The fine for " + daysOverdue + " days overdue is: rs: " + fine);
        }
        sc.close();
    }
}
