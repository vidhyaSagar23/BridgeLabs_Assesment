package org.oops.pojo;

public class StudentRunner {
    public static void main(String[] args) {
        StudentRunner s=new StudentRunner();
        s.addStudent();
    }
    public void addStudent(){
        Student s1=new Student();
        s1.setStudentId(1);
        s1.setStudentName("Sagar");
        s1.setEmail("sagar@gmail.com");
        s1.setStudentContact(9344503131l);

        Student s2=new Student(2,"scott",9344504141l,"scott@gmail.com");

        System.out.println(s1.getStudentId()+"\n"+s1.getStudentName()+"\n"+s1.getEmail()+"\n"+s1.getStudentContact());
        System.out.println("-----------------------------------");
        System.out.println(s2.getStudentId()+"\n"+s2.getStudentName()+"\n"+s2.getEmail()+"\n"+s2.getStudentContact());

    }
}
