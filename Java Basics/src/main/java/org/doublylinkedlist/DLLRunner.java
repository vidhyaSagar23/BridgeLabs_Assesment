package org.doublylinkedlist;

public class DLLRunner {
    public static void main(String[] args) {
        DLL l=new DLL();
       l.add(10);
       l.add(20);
       l.display();
       l.insertFirst(30);
       l.display();
       l.insertLast(40);
       l.display();
    }

}