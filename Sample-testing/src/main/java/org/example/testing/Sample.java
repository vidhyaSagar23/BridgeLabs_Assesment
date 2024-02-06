package org.example.testing;

public class Sample {
    public Sample(){
        System.out.println("constructor 1");
    }
    public Sample(int a){
        System.out.println("constructor 2 "+a);
    }
    public Sample(String a){
        System.out.println("constructor 3 "+a);
    }

    public  void m1(){
        System.out.println("method 1");
    }

    @Override
    public String toString(){
        return "Overridden method";
    }

}
