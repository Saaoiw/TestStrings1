package com.brainacad.oop.teststring3;

/**
 * Created by KrevSaa on 26.09.2016.
 * Create a class Main with a main() method.
 Create static method: uniqueChars(String s), which must  take a String as argument and return an array of distinct (unique) chars (char[]) of the given string.
 In method main() add code to invoke uniqueChars() method and pass string: “Using methods of class String” as argument. Print result to console.
 Execute the program.

 */
public class Main {
    private static char[] uniqueChars(String s){
        if ( s.length() == 0) return new char[0];
            else if (s.length() == 1) return new char[]{s.charAt(0)};
            else {
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < s.length(); i++) {
                    if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) stringBuilder.append(s.charAt(i));
                }
                return stringBuilder.toString().toCharArray();
            }
         }

    public static void main(String[] args) {
        System.out.println(uniqueChars("Using methods of class String"));
    }
}
