package org.oops.pojo;

public class Student {
    private int studentId;
    private String studentName;
    private long studentContact;
    private String email;

    public Student() {
    }

    public Student(int studentId, String studentName, long studentContact, String email) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentContact = studentContact;
        this.email = email;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getStudentContact() {
        return studentContact;
    }

    public void setStudentContact(long studentContact) {
        this.studentContact = studentContact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
