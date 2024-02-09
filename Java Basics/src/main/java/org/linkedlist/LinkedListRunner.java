package org.linkedlist;

public class LinkedListRunner {
    public static void main(String[] args) {
        LL l=new LL();
        l.insertFirst("Sagar",22);
        l.insertFirst("vidhya", 23);
        l.insertFirst("elangovan", 55);
        l.display();
        l.insertLast("sai", 11);
        l.display();
        l.insert("sankar", 37, 2);
        l.display();
        System.out.println(l.deleteFirst());
        System.out.println(l.deleteLast());
        System.out.println(l.delete(2));
        l.display();
        System.out.println(l.findNode("vidhya"));
        l.printReverse();

    }
}