package org.example.testing;

public class FirstSelenium {

    public static void main(String[] args) {
        Sample s1=new Sample();
        Sample s2=new Sample(22);
        Sample s3=new Sample("sagar");

        s1.m1();
        s2.m1();
        s3.m1();

        System.out.println(s1);
    }
}

