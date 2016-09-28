package com.brainacad.oop._2_9.teststring2;

/**
 * Created by KrevSaa on 26.09.2016.
 *
 */
public class Main {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

        System.out.println("The string myStr2 din't contains the next chars:");
        for (int i = 0; i < myStr1.length(); i++) {
            if ( myStr2.indexOf(myStr1.charAt(i)) == -1 ) System.out.println(myStr1.charAt(i));

        }
    }
}
