package org.oops.polymorphism.runtime;

public class RunTimePolymorphism {
    public static void main(String[] args) {
        Worker w1=new Worker();
        w1.worker();

        Worker w=new Employee();
        w.worker();
    }
}
