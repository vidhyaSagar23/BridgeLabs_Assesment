package org.basics.strings;

public class Reverse {
    public static void main(String[] args) {
        String word="Java Programming";
        String rev="";
        char c[]=word.toCharArray();
        for (int i = c.length-1; i >= 0; i--) {
            rev+=c[i];
        }
        System.out.println(rev);
    }
}