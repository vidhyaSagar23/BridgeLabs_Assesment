package org.basics.employeewages;

public class CompanyWageRunner {
    public static void main(String[] args) {
        Company infosys=new Company(1000,25,200);
        Company wipro=new Company(1500,24,210);

        System.out.println("infosys : "+infosys);
        System.out.println("wipro :"+wipro);
    }
}
