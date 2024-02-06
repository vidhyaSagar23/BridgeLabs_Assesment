package org.oops.encap;

import java.util.regex.Pattern;

public class Address {

    private String FirstName;
    private String LastName;
    private String Address;
    private String City;
    private String State;
    private int Zip;
    private long PhoneNumber;
    private String EmailId;

    // Regex patterns
    private static final String NAME_PATTERN = "[A-Z][a-zA-Z]*";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private static final String PHONE_NUMBER_PATTERN = "\\d{10}";
    private static final String ZIP_PATTERN = "\\d{6}";

    public Address() {
    }

    public Address(String firstName, String lastName, String address, String city, String state, int zip, long phoneNumber, String emailId) {
        FirstName = firstName;
        LastName = lastName;
        Address = address;
        City = city;
        State = state;
        Zip = zip;
        PhoneNumber = phoneNumber;
        EmailId = emailId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.matches(NAME_PATTERN)) {
            FirstName = firstName;
        } else {
            System.out.println("Invalid first name format. Name should start with an uppercase letter.");
        }
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        if (lastName.matches(NAME_PATTERN)) {
            LastName = lastName;
        } else {
            System.out.println("Invalid last name format. Name should start with an uppercase letter.");
        }
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getZip() {
        return Zip;
    }

    public void setZip(int zip) {
        String zipStr = String.valueOf(zip);
        if (zipStr.matches(ZIP_PATTERN)) {
            Zip = zip;
        } else {
            System.out.println("Invalid ZIP code format. It should contain 6 digits.");
        }
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        String phoneStr = String.valueOf(phoneNumber);
        if (phoneStr.matches(PHONE_NUMBER_PATTERN)) {
            PhoneNumber = phoneNumber;
        } else {
            System.out.println("Invalid phone number format. It should contain only 10 digits.");
        }
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String emailId) {
        if (emailId.matches(EMAIL_PATTERN)) {
            EmailId = emailId;
        } else {
            System.out.println("Invalid email format.");
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Address='" + Address + '\'' +
                ", City='" + City + '\'' +
                ", State='" + State + '\'' +
                ", Zip=" + Zip +
                ", PhoneNumber=" + PhoneNumber +
                ", EmailId='" + EmailId + '\'' +
                '}';
    }
}
