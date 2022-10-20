package javaEssence.charter10;

import java.util.Calendar;

public class CalendarEx6 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage : java CalendarEx6 2015 9");;
            return;
        }
        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int START_DAY_OF_WEEK = 0;
    }

    private static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1)+ "월 " + date.get(Calendar.DATE) + "일 ";
    }
}
