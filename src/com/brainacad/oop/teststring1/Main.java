package com.brainacad.oop.teststring1;

/**
 * Created by KrevSaa on 26.09.2016.
 * Create a class Main with a main() method. In method main() declare local variable myStr of String type and assign a value: “abracadabra”.
 Using the methods of the class String, do next steps:
 -	Find the index of first “ra” substring  of myStr value and print result to console.
 -	Find the index of last “ra” substring of myStr value and print result to console.
 -	Get substring of myStr from 3 to 7 char index and print result to console.
 -	Create static method reverseString(String) which return String value as result with changed order of letters (reverse it, for example “abcd” ->”dcba”).
 -	Invoke reverseString() method with myStr argument and print result to console.
 Execute the program.

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
