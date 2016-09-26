package com.brainacad.oop.teststring2;

/**
 * Created by KrevSaa on 26.09.2016.
 * Create new project called TestStrings2. Add package “com.brainacad.oop.teststring2”.
 Create a class Main with a main() method. In method main() declare two local variables myStr1
 and myStr2 of String type and assign a value “Cartoon” for first string and ”Tomcat” for second.
 Write code to display all of the letters, which are present in the first word, but absent in the second.

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
