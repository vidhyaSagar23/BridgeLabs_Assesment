package org.oops;

interface Add {

     default  void d1() {
          System.out.println("Default method");
     }
     void add(int a,int b);

     void multiple(int a,int b);
}
