package com.brainacad.oop._2_13.enums.testenum1;

/**
 * Created by Fujitsu on 13.10.2016.
 */

public class Main {
    enum MyDayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        public MyDayOfWeek nextDay() {
            //String nDay;
            if (this.ordinal() == MyDayOfWeek.values().length - 1) {
                return SUNDAY;
            }
            else return MyDayOfWeek.values()[ordinal() + 1];
        }
    }





    public static void main(String[] args) {
        //MyDayOfWeek myDayOfWeek;

        for (MyDayOfWeek day: MyDayOfWeek.values()) {
            switch (day){
                case TUESDAY:
                case THURSDAY:
                case SATURDAY:
                    System.out.println("My Java day: " + day);
                    System.out.println(MyDayOfWeek.valueOf(day.toString()).nextDay()  );
                    break;
            }

           // System.out.println(day);
        }
    }
}
