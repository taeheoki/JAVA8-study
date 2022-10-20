package javaInflearn13;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class MainClass3 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);
        LocalDateTime birthDay = LocalDateTime.of(1994, Month.APRIL,17, 10, 0, 0, 0);
        ZonedDateTime nowInUTC = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println("nowInUTC = " + nowInUTC);
        ZonedDateTime birthDayByUTC = ZonedDateTime.of(1994, Month.APRIL.getValue(), 17, 10, 0, 0, 0, ZoneId.of("UTC"));
        System.out.println("birthDayByUTC = " + birthDayByUTC);
    }
}
