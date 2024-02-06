package org.basics.assesment1;

public class Traffic {
    // Create a Java program that simulates a traffic light. Implement a system where the light changes.
    // based on predefined time intervals. Use conditional statements to determine which color.
    // (Red, Yellow, Green) should be displayed at any given time.
    public static void main(String[] args) {
        for (int seconds = 1; seconds <= 30; seconds++) {
            displayTrafficLight(seconds);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private static void displayTrafficLight(int seconds) {
        System.out.println("\nTime: " + seconds + " seconds");
        if (seconds % 15 == 0) {
            System.out.println("RED Light");
        } else if (seconds % 15 < 10) {
            System.out.println("GREEN Light");
        } else {
            System.out.println("YELLOW Light");
        }
    }
}
