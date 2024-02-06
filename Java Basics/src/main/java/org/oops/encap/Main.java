package org.oops.encap;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    static ArrayList<Address> list = new ArrayList<>();

    public static void main(String[] args) {
        boolean flag = true;

        while (flag) {
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contacts");
            System.out.println("3. Delete Contact");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            int choice = s.nextInt();
            Main obj = new Main();
            switch (choice) {
                case 1: {
                    obj.addcontact();
                    break;
                }
                case 2: {
                    obj.editcontact();
                    break;
                }
                case 3: {
                    deletecontact();
                    break;
                }
                case 4: {
                    flag = false;
                    break;
                }
            }
            System.out.println(list);
        }
    }

    private static void deletecontact() {
        String name = s.next();
        // Using iterator to avoid ConcurrentModificationException
        java.util.Iterator<Address> iterator = list.iterator();
        while (iterator.hasNext()) {
            Address a = iterator.next();
            if (a.getFirstName().equals(name)) {
                iterator.remove();
            }
        }
    }

    private void editcontact() {
        String name = s.next();

        for (Address a : list) {
            if (a.getFirstName().equals(name)) {
                System.out.println("Enter firstName");
                a.setFirstName(s.next());
                System.out.println("Enter lastname");
                a.setLastName(s.next());
                System.out.println("Enter address");
                a.setAddress(s.next());
                System.out.println("Enter City");
                a.setCity(s.next());
                System.out.println("Enter State");
                a.setState(s.next());
                System.out.println("Enter Zip");
                a.setZip(s.nextInt());
                System.out.println("Enter Phone Number");
                a.setPhoneNumber(s.nextLong());
                System.out.println("Enter EmailId");
                a.setEmailId(s.next());
            }
        }
    }

    private void addcontact() {
        Address address = new Address();
        System.out.println("Enter firstName");
        address.setFirstName(s.next());
        System.out.println("Enter lastname");
        address.setLastName(s.next());
        System.out.println("Enter address");
        address.setAddress(s.next());
        System.out.println("Enter City");
        address.setCity(s.next());
        System.out.println("Enter State");
        address.setState(s.next());
        System.out.println("Enter Zip");
        address.setZip(s.nextInt());
        System.out.println("Enter Phone Number");
        address.setPhoneNumber(s.nextLong());
        System.out.println("Enter EmailId");
        address.setEmailId(s.next());
        list.add(address);
    }
}
