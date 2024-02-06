package org.oops.pojo;

import java.util.ArrayList;
import java.util.List;

public class ContactRunner {
    static List<Contact> list=new ArrayList<>();
    public static void main(String[] args) {
        ContactRunner c=new ContactRunner();
        c.addContact();
        c.editContact("sagar","scott");
        c.display();
    }
    public void addContact(){

        Contact c2=new Contact("sagar",98765432112l,"bangalore");

        Contact c1=new Contact();
        c1.setfName("vidhya sagar");
        c1.setPhno(987654321l);
        c1.setAddress("Bangalore");

        list.add(c1);
        list.add(c2);
    }
    public void editContact(String fName,String name1){
        for (Contact c:list){
            if (fName.equals(c.getfName())){
                c.setfName(name1);
            }
        }
    }
    public void display(){
        for(Contact c:list){
            System.out.println(c.getfName()+" "+c.getPhno()+" "+c.getAddress());
        }
    }
}
