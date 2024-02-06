package org.oops.pojo;

public class Contact {
    private String fName;
    private long phno;
    private String address;

    public Contact(String fName, long phno, String address) {
        this.fName = fName;
        this.phno = phno;
        this.address = address;
    }

    public Contact() {
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public long getPhno() {
        return phno;
    }

    public void setPhno(long phno) {
        this.phno = phno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
