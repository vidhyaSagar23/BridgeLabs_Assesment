package org.oops.polymorphism.compiletime;

public class Calculator {
    public static void main(String[] args) {
        add();
        add(1);
        add(1,2);
        add(1,2,3);
    }

    public static void add(){
        System.out.println("addition");
    }
    public static  void add(int a){
        System.out.println(a);
    }
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
