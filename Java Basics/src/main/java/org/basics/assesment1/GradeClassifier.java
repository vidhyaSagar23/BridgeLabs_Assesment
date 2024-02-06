package org.basics.assesment1;

import java.util.Scanner;

public class GradeClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's score: ");
        int score = scanner.nextInt();
        scanner.close();
        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("D");
        } else if (score >= 0 && score < 60) {
            System.out.println("F");
        } else {
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
        }
    }
}
