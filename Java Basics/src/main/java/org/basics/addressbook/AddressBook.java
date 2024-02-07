package org.basics.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    List<Contact> list=new ArrayList<>();
   static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {

        AddressBook a=new AddressBook();
        boolean flag=true;
        while(flag) {
            System.out.println("1: Add Contact\n2: Display Contacts\n3: Edit Person Details\n4: Delete\n5: Exit");
            System.out.println("Enter Choice number");
            switch (s.nextInt()) {
                case 1: {
                    a.addContact();
                    break;
                }
                case 2: {
                    a.display();
                    break;
                }
                case 3:{
                    a.editPerson();
                    break;
                }
                case 4:{
                    a.deleteContact();
                    break;
                }
                case 5:{
                    flag=false;
                    System.out.println("Exited");
                    break;
                }
                default:{
                    System.out.println("Invalid choice..choose correct option");
                }
            }
        }
    }

    private void deleteContact() {
        System.out.println("Enter Person First Name");
        String name=s.next();
        for(Contact c:list){
            if (c.getFirstName().equals(name)){
                list.remove(c);
                System.out.println(name+" Details Deleted");
                break;
            }
        }
    }

    private void editPerson() {
        System.out.println("Enter Person First Name to be edited");
        String name=s.next();
        for (Contact c:list){
            if(c.getFirstName().equals(name)){
                System.out.print("First Name: ");
                String fName=s.next();
                boolean flag=true;
                for (Contact contact:list){
                    if (contact.getFirstName().equals(fName)){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    c.setFirstName(fName);
                    System.out.print("\nLast Name : ");
                    c.setLastName(s.next());
                    System.out.print("\nAddress : ");
                    c.setAddress(s.next());
                    System.out.print("\nCity : ");
                    c.setCity(s.next());
                    System.out.print("\nState : ");
                    c.setState(s.next());
                    System.out.print("\nZip Code : ");
                    c.setZipCode(s.nextInt());
                    System.out.print("\nPhone Number : ");
                    c.setPhoneNumber(s.nextLong());
                    System.out.print("\nEmail : ");
                    c.setEmail(s.next());

                    list.add(c);
                }
                else{
                    System.out.println("First Name Already Exists..Please try Different names");
                }
            }
        }
    }

    private void display() {
        for (Contact c:list){
            System.out.println(c);
            System.out.println("\n---------------------------------------");
        }
    }

    private void addContact() {
        Contact c=new Contact();
        System.out.print("First Name : ");
        String fName=s.next();
        boolean flag=true;
        for (Contact contact:list){
            if (contact.getFirstName().equals(fName)){
                flag=false;
                break;
            }
        }
        if(flag){
            c.setFirstName(fName);
            System.out.print("\nLast Name : ");
            c.setLastName(s.next());
            System.out.print("\nAddress : ");
            c.setAddress(s.next());
            System.out.print("\nCity : ");
            c.setCity(s.next());
            System.out.print("\nState : ");
            c.setState(s.next());
            System.out.print("\nZip Code : ");
            c.setZipCode(s.nextInt());
            System.out.print("\nPhone Number : ");
            c.setPhoneNumber(s.nextLong());
            System.out.print("\nEmail : ");
            c.setEmail(s.next());

            list.add(c);
        }
        else{
            System.out.println("First Name Already Exists..Please try Different names");
        }

    }
}
