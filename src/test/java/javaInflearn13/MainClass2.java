package javaInflearn13;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class MainClass2 {
    public static void main(String[] args) {
        Instant instant = Instant.now(); // 기준시 UTC (GMT)
        System.out.println("instant = " + instant);
        ZoneId zone = ZoneId.systemDefault();
        System.out.println("zone = " + zone);
        ZonedDateTime zonedDateTime = instant.atZone(zone);
        System.out.println("zonedDateTime = " + zonedDateTime);
    }
}
