package org.basics.assesment1;

import java.util.Scanner;

public class Calculator {


    //Implement a menu-driven calculator in C# that allows users to perform basic operations
    // (addition, subtraction, multiplication, division). Use conditional statements to execute
    // the selected operation and handle invalid inputs.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice 1 to 5: ");
            int choice = s.nextInt();
            if (choice == 5) {
                break;
            }
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice");
                continue;
            }
            System.out.print("Enter num1: ");
            double num1 = s.nextDouble();

            System.out.print("Enter num2: ");
            double num2 = s.nextDouble();

            double result = 0;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Cannot divide by zero");
                        continue;
                    }
                    break;
            }
            System.out.println(result);
        }
    }
}
