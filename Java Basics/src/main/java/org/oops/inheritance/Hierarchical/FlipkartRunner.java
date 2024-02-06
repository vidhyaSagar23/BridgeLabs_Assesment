package org.oops.inheritance.Hierarchical;

public class FlipkartRunner {
    public static void main(String[] args) {
        Flipkart f1=new Employee();
        f1.login();
        f1.logout();

        System.out.println("---------------------------");
        Flipkart f2=new User();
        f2.login();
        f2.logout();
    }
}
