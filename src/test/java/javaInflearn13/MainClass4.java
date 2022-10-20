package javaInflearn13;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class MainClass4 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthDay = LocalDate.of(2020, Month.JULY, 10);
        Period period = Period.between(birthDay, today);
        System.out.println(period.getMonths() + "개월 " + period.getDays() + "일");
        Period until = today.until(birthDay);
        System.out.println("until.get(ChronoUnit.DAYS) = " + until.get(ChronoUnit.DAYS));
        Instant now = Instant.now();
        Instant plus = now.plus(10, ChronoUnit.SECONDS);
        Duration duration = Duration.between(now, plus);
        System.out.println(duration.getSeconds());
    }
}
