package com.brainacad.oop._2_13.enums.testenum1;

/**
 * Created by Fujitsu on 13.10.2016.
 */

public class Main {
    enum MyDayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

       /* public String nextDay(MyDayOfWeek day) {
            //String nDay;
            MyDayOfWeek myDayOfWeek[] = MyDayOfWeek.values();
            for (int i = 0; i < myDayOfWeek.length; i++) {
                if (myDayOfWeek[i] == day) {
                    if (i + 1 == myDayOfWeek.length) {
                        return myDayOfWeek[0].toString();
                    } else return myDayOfWeek[i + 1].toString();
                }
            }
        }*/
    }





    public static void main(String[] args) {
        //MyDayOfWeek myDayOfWeek;

        for (MyDayOfWeek day: MyDayOfWeek.values()) {
            switch (day){
                case TUESDAY:
                case THURSDAY:
                case SATURDAY:
                    System.out.println("My Java day: " + day);
                    break;
            }

           // System.out.println(day);
        }
    }
}
