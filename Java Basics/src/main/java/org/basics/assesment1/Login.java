package org.basics.assesment1;

import java.util.Scanner;

public class Login {

    //Design a simple login system in Java where users provide their username and password.
    // Use conditional statements to check the credentials and provide appropriate feedback,
    // such as successful login, incorrect username, incorrect password, or account locked.

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name");
        String name=s.next();

        System.out.println("Enter password");
        String password=s.next();

        int max=3;

        while (max>0){
            System.out.println("Enter username and password");
            if (name.equals(s.next())) {
                if (password.equals(s.next())){
                    System.out.println("Login success");
                    break;
                }
                else
                    System.out.println("Incorrect password");
            }
            else
                System.out.println("Incorrect username");
            max--;
            if(max !=0)
                System.out.println("You have "+max+" chance");
            else{
                System.out.println("Account locked");
            }
        }
    }

}
