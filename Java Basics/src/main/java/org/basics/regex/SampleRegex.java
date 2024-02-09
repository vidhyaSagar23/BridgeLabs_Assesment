package org.basics.regex;

import java.util.regex.Pattern;

public class SampleRegex {
    private static final String NAME_PATTERN="[A-Z]{1}[a-z]{2,10}";
    public static void main(String[] args) {
        System.out.println("\"Sagarvsp\".matches(NAME_PATTERN) => "+"Sagarvsp".matches(NAME_PATTERN));

        System.out.println("\"sagar\".matches(NAME_PATTERN) => "+"sagar".matches(NAME_PATTERN));

        System.out.println("Pattern.matches(\"[sa]?\",\"s\") => "+Pattern.matches("[sa]?","s"));  // cannot have other chars and one only

        System.out.println("Pattern.matches(\"[sa]+\",\"saass\") => "+Pattern.matches("[sa]+","saass"));  // can have more than 1 but not others

        System.out.println("Pattern.matches(\"[sag]*\",\"saass\") => "+Pattern.matches("[sag]*","saass"));  // can have more than 1 or 0 also but not others

        System.out.println("\"saasgf\".matches(\"[sag]*\") => "+"saasgf".matches("[sag]*"));


//          Any character except abcd and it should have 3 characters

        System.out.println("\"abi\".matches(\"[^abc]\") => "+"abi".matches("[^abc]"));

        System.out.println("\"key\".matches(\"[^abc]{2,3}\") => "+"key".matches("[^abc]{2,3}"));

//


    }
}
