package org.basics.datatypes;

public class Conditional {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=15;

        if(a>b){
            if (a>c) {
                System.out.println("a is greater b and c");
            }
        }
        else if(b>c){
            if (b>a){
                System.out.println("b is greater than a and c");
            }
        }
        else{
            System.out.println("c is greater than a and b");
        }
    }
}
