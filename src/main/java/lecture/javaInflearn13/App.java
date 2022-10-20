package lecture.javaInflearn13;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class App {
    public static void main(String[] args) {
        Date date = new Date();
        Instant instant = date.toInstant();
        Date newDate = Date.from(instant);

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        ZonedDateTime dateTime = gregorianCalendar.toInstant().atZone(ZoneId.systemDefault());
        GregorianCalendar from = GregorianCalendar.from(dateTime);

    }
}
