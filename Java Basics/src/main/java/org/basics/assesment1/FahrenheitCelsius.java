package org.basics.assesment1;

import java.util.Scanner;

public class FahrenheitCelsius {
   // Develop a Java program that converts temperatures between Fahrenheit and Celsius based on user
    // input. Use conditional statements to determine the conversion formula based on the user's choice.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();
        System.out.println("Choose conversion type:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.close();
        double convertedTemperature;
        if (choice == 1) {
            convertedTemperature = (temperature - 32) * 5 / 9;
            System.out.println(convertedTemperature + " Celsius");
        } else if (choice == 2) {
            convertedTemperature = (temperature * 9 / 5) + 32;
            System.out.println(convertedTemperature + " Fahrenheit");
        } else {
            System.out.println("Please enter 1 or 2.");
        }
    }
}
