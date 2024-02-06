package org.basics.strings;

public class Palindrome {
    public static void main(String[] args) {
        String word="malayalam";
        boolean flag=true;
        for (int i = 0,j=word.length()-1; i < word.length()/2; i++,j--) {
            if(word.charAt(i) != word.charAt(j)){
                flag=false;
                break;
            }
        }
        if(flag==true){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
