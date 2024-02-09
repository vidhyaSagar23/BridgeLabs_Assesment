package org.stackimpl;

public class StackImpl{
    private int[] arr;
    private int top;

    public StackImpl(int size){
        arr=new int[size];
        top=-1;
    }

    public void push(int value) {
        if (top== arr.length-1){
            System.out.println("Stack is full");
        }
        else{
            top++;
            arr[top]=value;
        }
    }

    public int pop() {
        if (top == -1){
            System.out.println("Stack is already Empty");
            return -1;
        }
        else{
            int popped_value=arr[top];
            top--;
            return popped_value;
        }
    }

    public boolean isEmpty() {
        if (top==-1){
            return true;
        }
        else{
            return false;
        }
    }

    public void display() {
        if (top==-1){
            System.out.println("Stack is Empty");
        }
        else{
            for (int i = top; i >=0 ; i--) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
