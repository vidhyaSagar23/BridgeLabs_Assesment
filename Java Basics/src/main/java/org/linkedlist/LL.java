package org.linkedlist;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    class Node{
        private String name;
        private int age;
        private Node next;

        public Node(String name,int age) {
            this.name=name;
            this.age=age;
        }
        public Node(String name,int age,Node next) {
            this.name=name;
            this.age=age;
            this.next=next;
        }
    }
//	To add node at first

    public void insertFirst(String name,int age) {
        Node node=new Node(name,age);
        node.next=head;
        head=node;
        if(tail==null) {
            tail=head;
        }
        size=size+1;
    }

//	To insert at last

    public void insertLast(String name,int age) {
        if(tail==null) {
            insertFirst(name,age);
        }
        Node node=new Node(name,age);
        tail.next=node;
        tail=node;
        size++;
    }

//	To insert in between

    public void insert(String name,int age,int index) {
        if(index==0) {
            insertFirst(name, age);
        }
        if(index==size) {
            insertLast(name, age);
        }
        Node temp=head;
        for(int i=1;i<index;i++) {
            temp=temp.next;
            if(temp==null) {
                System.out.println("index out of range");
                return;
            }
        }
        Node node=new Node(name,age,temp.next);
        temp.next=node;
        size++;
    }

//	To delete the firstnode

    public String deleteFirst() {
        String value=head.name;
        head=head.next;
        if(head==null) {
            tail=null;
        }
        size--;
        return value;
    }

//	To delete lastnode

    public String deleteLast() {
        if(size<=1) {
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        String value=tail.name;
        tail=secondLast;
        tail.next=null;
        size--;
        return value;

    }
    public Node get(int index) {
        Node temp=head;
        for(int i=0;i<index;i++) {
            temp=temp.next;
        }
        return temp;
    }

    //	To delete node inbetween
    public String delete(int index) {
        if(index>=size) {
            throw new UnsupportedOperationException("Invalid index");
        }
        if(index==0) {
            return deleteFirst();
        }
        if(index==size-1) {
            return deleteLast();
        }
        Node prev=get(index-1);
        String value=prev.next.name;
        prev.next=prev.next.next;
        size--;
        return value;

    }

    //	to find the node based on value
    public Node findNode(String name) {
        Node temp=head;
        while(temp!=null) {
            if(temp.name.equals(name)){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
//	To Display nodes

    public void display() {
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.name+" "+temp.age+" ->");
            temp=temp.next;
        }
        System.out.println();

    }

//	To print in reverse order using recursion

    public void printReverse() {
        System.out.println(head);
        reverse(head);
    }
    public void reverse(Node start) {
        if(start.next!=null) {
            reverse(start.next);
        }
        System.out.print(start.name+" "+start.age+" <- ");
    }
}