package org.basics.assesment1;

import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        //Write a Java program that calculates the price of a movie ticket based on the age of the
        // customer and the time of the movie. Implement different pricing rules for children (under 12),
        // adults (12-64), and seniors (65+), and consider matinee discounts.

                Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter the time of the movie 24-hour format: ");
        int movieTime = scanner.nextInt();
        double price;
        if (age < 12) {
            price = 5.00;
        } else if (age >= 12 && age <= 64) {
            price = 10.00;
        } else {
            price = 7.50;
        }
        if (movieTime < 17) {
            price = price-2.00;
        }
        System.out.println("Ticket Price: " + price);
    }
}
