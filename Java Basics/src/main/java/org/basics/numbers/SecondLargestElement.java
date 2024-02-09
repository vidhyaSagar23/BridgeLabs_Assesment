package org.basics.numbers;

import java.util.*;

public class SecondLargestElement {
    public static void main(String[] args) {
        m1();
//        int[] a = {10, 20, 30, 40};
//        int largest = a[0];
//        int secondlargest = a[0];
//        for (int i = 1; i < a.length; i++) {
//            if (a[i] > largest) {
//                secondlargest = largest;
//                largest = a[i];
//            } else if (a[i] > secondlargest && a[i] != largest) {
//                secondlargest = a[i];
//            }
//        }
//        System.out.println("Second Largest : " + secondlargest);
    }

    public static void m1(){
        int n=2;
        int[] a = {10, 20, 30, 40};
        System.out.println(Arrays.asList(a));
        ArrayList al=new ArrayList();
        for (int i = 0; i < a.length; i++) {
            al.add(a[i]);
        }
        ArrayList h=new ArrayList<Integer>(new TreeSet<Integer>(al));
        System.out.println(h);
    }
}