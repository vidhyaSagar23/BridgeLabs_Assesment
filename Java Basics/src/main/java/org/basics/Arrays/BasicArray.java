package org.basics.Arrays;

import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a[]=new int[s.nextInt()];

        System.out.println("Enter "+a.length+" values");
        for (int i = 0; i < a.length; i++) {
            a[i]=s.nextInt();
        }

        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
