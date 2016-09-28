package com.brainacad.oop._2_9.teststring1;

/**
 * Created by KrevSaa on 26.09.2016.
 *
 */
public class Main {
    static String reverseString(String str){
        return new StringBuffer(str).reverse().toString();
    }

    public static void main(String[] args) {
        String myStr = "abracadabr1a";

        System.out.println("First index of the substring \"ra\" is " + myStr.indexOf("ra"));
        System.out.println("Index of the last substring \"ra\" is: " + myStr.lastIndexOf("ra"));
        System.out.println("Substring of the myStr from 3 to 7 char is: " + myStr.substring(3 , 7));

        System.out.println(reverseString(myStr));
    }
}
