package org.stackimpl;

public class StackRunner {
    public static void main(String[] args) {
        StackImpl stack=new StackImpl(5);

        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.display();
        stack.pop();
        stack.display();
        stack.push(12);
        stack.display();
        stack.push(10);
        stack.display();
        System.out.println(stack.isEmpty());
    }
}
