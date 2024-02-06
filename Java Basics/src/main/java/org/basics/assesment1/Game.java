package org.basics.assesment1;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Rock Paper Scissors Game");
            System.out.println("Enter First User");
            System.out.println("Enter number \n1.Rock 2.Paper 3.Scissor");
            int user1 = Integer.parseInt(sc.nextLine());

            System.out.println("Enter Second User");
            System.out.println("Enter number \n1.Rock 2.Paper 3.Scissor");
            int user2 = Integer.parseInt(sc.nextLine());

            if (user1 == 1) {
                if (user2 == 2)
                    System.out.println("User2 win");
                else if (user2 == 3)
                    System.out.println("User1 win");
                else
                    System.out.println("Draw Match");
            } else if (user1 == 2) {
                if (user2 == 1)
                    System.out.println("User1 win");
                else if (user2 == 3)
                    System.out.println("User2 win");
                else
                    System.out.println("Draw Match");
            } else if (user1 == 3) {
                if (user2 == 2)
                    System.out.println("User1 win");
                else if (user2 == 1)
                    System.out.println("User2 win");
                else
                    System.out.println("Draw Match");
            } else {
                System.out.println("Invalid Input");
            }

            System.out.println("play again? Enter 'Y' for Yes");

            if (!sc.nextLine().equalsIgnoreCase("Y")) {
                break;
            }
        }
    }
}
