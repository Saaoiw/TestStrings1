package com.brainacad.oop.testsregexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Work on 27.09.2016.
 */
public class Main {
    public static boolean checkPersonWithRegExp(String userNameString){
        Pattern regex =  Pattern.compile("^[A-Z][a-z]*");
        Matcher matcher = regex.matcher(userNameString);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] testStrings = {"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", " "};
        for (String s : testStrings) {
            System.out.println(s + " : " + checkPersonWithRegExp(s));
        }

    }
}
