package org.oops.inheritance.Hierarchical;

public class User extends Flipkart{
    @Override
    public void login() {
        System.out.println("User login in flipkart");
    }

    @Override
    public void logout() {
        System.out.println("User logout in flipkart");
    }
}
