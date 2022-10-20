package javaInflearn13;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        Date date = new Date();
        long time = date.getTime();
        System.out.println("date = " + date);
        Thread.sleep(1000 * 3);
        Date after3Seconds = new Date();
        System.out.println("after3Seconds = " + after3Seconds);
        after3Seconds.setTime(time);
        System.out.println("after3Seconds = " + after3Seconds);

        Calendar birthDay = new GregorianCalendar(1988, Calendar.OCTOBER, 10);
    }
}

