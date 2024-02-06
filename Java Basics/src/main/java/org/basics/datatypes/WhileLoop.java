package org.basics.datatypes;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        int i=10;
        while(i>0){
            System.out.println(i+" * "+n+" = "+i*n);
            i--;
        }
    }
}
