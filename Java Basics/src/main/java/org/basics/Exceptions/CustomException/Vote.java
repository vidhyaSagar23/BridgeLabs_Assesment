package org.basics.Exceptions.CustomException;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter your Age");

        if(s.nextInt()>=18){
            System.out.println("You can vote");
        }
        else {
                throw new InvalidAgeException("You are not allowed to vote");
        }
    }
}
