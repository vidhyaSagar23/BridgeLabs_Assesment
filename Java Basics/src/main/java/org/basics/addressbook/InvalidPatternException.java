package org.basics.addressbook;

public class InvalidPatternException extends RuntimeException{
    private String message;

    public InvalidPatternException(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
