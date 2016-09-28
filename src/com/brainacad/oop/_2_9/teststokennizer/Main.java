package com.brainacad.oop._2_9.teststokennizer;

import java.util.StringTokenizer;

/**
 * Created by Work on 27.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        String myStr = "This is String, split by StringTokenizer. Created by Student:Name of Student";

        StringTokenizer space = new StringTokenizer(myStr);
        StringTokenizer comma = new StringTokenizer(myStr, ",");
        StringTokenizer dot = new StringTokenizer(myStr, ".");

        while (space.hasMoreElements()) {
            System.out.println(space.nextElement());
        }

        while (comma.hasMoreElements()) {
            System.out.println(comma.nextElement());
        }

        while (dot.hasMoreElements()) {
            System.out.println(dot.nextElement());
        }

    }
}
