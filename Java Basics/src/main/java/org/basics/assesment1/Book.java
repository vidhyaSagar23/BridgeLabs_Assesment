package org.basics.assesment1;

import java.util.Scanner;

class Book {
    // Design a library reservation system in Java. Allow users to check the availability of books
    // and reserve them. Use conditional statements to manage the reservation process, considering
    // factors like book availability, user limits, and reservation duration.

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        String books[]={"Java","SQL","HTML","CSS","JS"};
        boolean flag[]={false,false,false,false,false};
        boolean f=true;
        while(f){
            System.out.println("Enter option number\n1. Check availability \n2. Reserve book\n3. Exit");
            System.out.println("---------------------------------------------");
            switch (s.nextInt()){
                case
                        1:{
                    int i=1;
                    for(String b:books){
                        System.out.println(i++ +" : " +b);
                    }
                    System.out.println("---------------------------------------------");
                    break;
                }
                case
                        2:{
                    System.out.println("Enter the book Id");
                    int bookId=s.nextInt();
                    if(flag[bookId-1]==false){
                        System.out.println("Enter reservation time in 24hrs ");
                        if (s.nextInt()>0 && s.nextInt()<=24){
                            flag[bookId-1]=true;
                            System.out.println("Book reserved");
                            System.out.println("---------------------------------------------");
                        }
                        else {
                            System.out.println("Enter Valid time format between 1 to 24");
                            System.out.println("---------------------------------------------");
                        }
                    }
                    else{
                        System.out.println("Book already reserved...Please Come later");
                        System.out.println("---------------------------------------------");
                    }
                    break;
                }
                case 3:{
                    f=false;
                    System.out.println("Reservation Exited");
                    System.out.println("---------------------------------------------");
                    break;
                }
                default:{
                    System.out.println("Enter valid choice");
                    System.out.println("---------------------------------------------");
                }
            }
        }
    }
}
