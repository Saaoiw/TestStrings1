package com.brainacad.oop.testclasses;

import java.util.Map;

class Test{
    public static void main(String[] args) {
        Map<String, String> env = System.getenv();

        for (String envName: env.keySet()) {
            System.out.printf("%s=%s%n", envName, env.get(envName));
        }
    }
}


