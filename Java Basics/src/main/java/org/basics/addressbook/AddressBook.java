package org.basics.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    List<Contact> list=new ArrayList<>();
   static Scanner s=new Scanner(System.in);

    private static final String NAME_PATTERN = "[A-Z]{1}[a-z]{2,10}";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9_+&-]+(?:\\.[a-zA-Z0-9_+&-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private static final String PHONE_NUMBER_PATTERN = "[6789]{1}\\d{9}";
    private static final String ZIP_PATTERN = "\\d{6}";
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
                System.out.print("First Name : ");
                String fName=s.next();
                if(fName.matches(NAME_PATTERN)){
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
                        String lName=s.next();
                        if(lName.matches(NAME_PATTERN)){
                            c.setLastName(lName);
                        }
                        else{
                            throw new InvalidPatternException("Last name should start with upper case and it should have atleast 3 characters");
                        }
                        System.out.print("\nAddress : ");
                        c.setAddress(s.next());
                        System.out.print("\nCity : ");
                        String city=s.next();
                        if(city.matches(NAME_PATTERN)){
                            c.setCity(city);
                        }
                        else{
                            throw new InvalidPatternException("City Name Should Start with Upper case");
                        }


                        System.out.print("\nState : ");
                        String state=s.next();
                        if(state.matches(NAME_PATTERN)){
                            c.setState(state);
                        }
                        else{
                            throw new InvalidPatternException("State Name Should Start with Upper case");
                        }
                        System.out.print("\nZip Code : ");
                        int zip=s.nextInt();
                        String zipStr = String.valueOf(zip);

                        if(zipStr.matches(ZIP_PATTERN)){
                            c.setZipCode(zip);
                        }
                        else{
                            throw new InvalidPatternException("Zip Code Should have only 6 digits");
                        }
                        System.out.print("\nPhone Number : ");
                        long phno=s.nextLong();
                        String phnoStr = String.valueOf(phno);

                        if(phnoStr.matches(PHONE_NUMBER_PATTERN)){
                            c.setPhoneNumber(phno);
                        }
                        else{
                            throw new InvalidPatternException("Phone Number Should have only 10 digits");
                        }
                        System.out.print("\nEmail : ");
                        String email=s.next();
                        if(email.matches(EMAIL_PATTERN)){
                            c.setEmail(email);
                        }
                        else{
                            throw new InvalidPatternException("Email Mismatched");
                        }

                        list.add(c);
                    }
                    else{
                        System.out.println("First Name Already Exists..Please try Different names");
                    }
                }else{
                    throw new InvalidPatternException("Name Should start with Upper case and it should have at-least 3 characters");
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
        if(fName.matches(NAME_PATTERN)){
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
                String lName=s.next();
                if(lName.matches(NAME_PATTERN)){
                    c.setLastName(lName);
                }
                else{
                    throw new InvalidPatternException("Last name should start with upper case");
                }
                System.out.print("\nAddress : ");
                c.setAddress(s.next());
                System.out.print("\nCity : ");
                String city=s.next();
                if(city.matches(NAME_PATTERN)){
                    c.setCity(city);
                }
                else{
                    throw new InvalidPatternException("City Name Should Start with Upper case");
                }


                System.out.print("\nState : ");
                String state=s.next();
                if(state.matches(NAME_PATTERN)){
                    c.setState(state);
                }
                else{
                    throw new InvalidPatternException("State Name Should Start with Upper case");
                }
                System.out.print("\nZip Code : ");
                int zip=s.nextInt();
                String zipStr = String.valueOf(zip);

                if(zipStr.matches(ZIP_PATTERN)){
                    c.setZipCode(zip);
                }
                else{
                    throw new InvalidPatternException("Zip Code Should have only 6 digits");
                }
                System.out.print("\nPhone Number : ");
                long phno=s.nextLong();
                String phnoStr = String.valueOf(phno);

                if(phnoStr.matches(PHONE_NUMBER_PATTERN)){
                    c.setPhoneNumber(phno);
                }
                else{
                    throw new InvalidPatternException("Phone Number Should have only 10 digits");
                }
                System.out.print("\nEmail : ");
                String email=s.next();
                if(email.matches(EMAIL_PATTERN)){
                    c.setEmail(email);
                }
                else{
                    throw new InvalidPatternException("Email Mismatched");
                }

                list.add(c);
            }
            else{
                System.out.println("First Name Already Exists..Please try Different names");
            }
        }else{
            throw new InvalidPatternException("Name Should start with Upper case and it should have at-least 3 characters");
        }
    }
}
