package org.oops.abstraction;

public class RegisterRunner {
    public static void main(String[] args) {
        Register r=new RegisterImpl();
        r.signup();
        r.login();
    }
}
