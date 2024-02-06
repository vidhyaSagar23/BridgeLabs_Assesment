package org.oops.inheritance.Hierarchical;

public class Employee extends Flipkart{
    @Override
    public void login() {
        System.out.println("Employee Login in flipkart");
    }

    @Override
    public void logout() {
        System.out.println("Employee Logout in flipkart");
    }
}
