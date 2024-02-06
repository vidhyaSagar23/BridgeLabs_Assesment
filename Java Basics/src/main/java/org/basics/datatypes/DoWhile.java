package org.basics.datatypes;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();

        int i=1;
       do{
           System.out.println(i+" * "+n+" = "+i*n);
           i++;
       }while(i<=10);
    }
}
