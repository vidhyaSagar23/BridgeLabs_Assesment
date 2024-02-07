package org.oops;

public class AddImpl implements  Add{
    @Override
    public void add(int a, int b) {
        System.out.println(a+b);
    }

    @Override
    public void multiple(int a, int b) {
        System.out.println(a*b);
    }
}
