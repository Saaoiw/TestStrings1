package com.brainacad.oop._2_15.testcollection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by Fujitsu on 12.10.2016.
 */
class MyTranslator{
    private HashMap<String , String > dictionary;

    public void addNewWord(String en, String ru){
        dictionary.put(en, ru);
    }

    public HashMap<String, String> getDictionary() {
        return dictionary;
    }

    public String translate(String en){
        return dictionary.get(en);
    }
}
public class TestMap1 {
    public static void main(String[] args) throws Exception {
        MyTranslator myTranslator = new MyTranslator();

        System.out.println("Filling the dictionary(please enter the pair of worlds), \n for ending enter \"end\" :");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in ));
        while (!bufferedReader.readLine().equals("end")){
            System.out.println(1);
            myTranslator.addNewWord(bufferedReader.readLine(), bufferedReader.readLine());
        }

        System.out.println(myTranslator.getDictionary());

    }

}

