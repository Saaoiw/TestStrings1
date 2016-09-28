package com.brainacad.oop._2_9.teststring3;

/**
 * Created by KrevSaa on 26.09.2016.
 *
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
