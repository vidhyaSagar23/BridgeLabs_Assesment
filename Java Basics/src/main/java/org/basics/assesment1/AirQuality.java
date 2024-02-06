package org.basics.assesment1;

import java.util.Scanner;

public class AirQuality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the concentration of PM2. 5 pollutants ");
            double pm25;
            try {
                pm25 = Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid concentration.");
                continue;
            }
            String result = "";
            int value = (int) pm25;

            if (50 >= value)
                result = "Good";
            else if (100 >= value)
                result = "Moderate";
            else if (150 >= value)
                result = "Unhealthy for Sensitive Groups";
            else if (200 >= value)
                result = "Unhealthy";
            else
                result = "Very Unhealthy";

            System.out.println(result);
            System.out.println("Continue? Enter 'Y' for Yes");
            if (!sc.nextLine().equalsIgnoreCase("Y")) {
                break;
            }
        }
    }
}
