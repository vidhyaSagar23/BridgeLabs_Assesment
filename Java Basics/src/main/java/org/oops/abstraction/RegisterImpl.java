package org.oops.abstraction;

public class RegisterImpl implements Register{
    @Override
    public void login() {
        System.out.println("user login method");
    }

    @Override
    public void signup() {
        System.out.println("User signup method");
    }
}
