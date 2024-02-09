package org.doublylinkedlist;

public class DLL {
    private Node head;
    private Node tail;
    private int size;

    private class Node{
        Node next;
        Node prev;
        int value;
        Node(int value){
            this.value=value;
        }
        Node(int value,Node prev,Node next){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }

//	 To insert at first
    public void insertFirst(int value) {
        Node node=new Node(value);
        node.next=head;
        node.prev=null;
        if(head!=null) {
            head.prev=node;
        }
        head=node;
        if(tail==null) {
            tail=head;
        }
        size+=1;
        System.out.println("size :"+size);
    }

//	to insert
    public void add(int value) {
        if(tail==null) {
            insertFirst(value);
            return;
        }
        Node node=new Node(value);
        node.next=null;
        node.prev=tail;
        tail.next=node;
        tail=node;
        size++;
        System.out.println("size :"+size);
    }

//    To insert at last using tail

    public void  insertLast(int value){
        Node node=new Node(value);
        node.next=null;
        node.prev=tail;
        tail.next=node;
        if(head == null){
            head=node;
        }
        tail=node;
        size++;
        System.out.println("size :"+size);
    }

//	To insert at last without using tail
    public void insertLastTail(int value) {
        Node node=new Node(value);
        Node last=head;
        node.next=null;
        if(head==null) {
            node.prev=null;
            head=node;
            tail=head;
            size++;
            System.out.println("size :"+size);
            return;
        }

        while(last.next!=null) {
            last=last.next;
        }
        node.prev=last;
        last.next=node;
        tail=node;
        size++;
        System.out.println("size :"+size);
    }

//	To Display the nodes

    public void display() {
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }

//	To FIND THE NODE BY VALUE

    public Node find(int val) {
        Node temp=head;
        while(temp != null) {
            if(temp.value==val) {
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }

//	To insert an node after a given value

    public void insert(int after,int value) {
        Node prev=find(after);
        if(prev==null)
        {
            System.out.println("Node doesn't exist");
            return;
        }
        Node node=new Node(value);
        node.next=prev.next;
        node.prev=prev;
        prev.next=node;
        if(node.next != null) {
            node.next.prev=node;
        }
        if(node.next==null) {
            tail=node;
        }
        size++;
    }
}