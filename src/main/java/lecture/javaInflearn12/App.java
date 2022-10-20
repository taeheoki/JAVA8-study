package lecture.javaInflearn12;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Calendar taeheokiBirthDay = new GregorianCalendar(1994, Calendar.APRIL, 17);
        System.out.println(taeheokiBirthDay.getTime());
    }
}
