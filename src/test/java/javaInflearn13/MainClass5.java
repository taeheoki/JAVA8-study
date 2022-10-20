package javaInflearn13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainClass5 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter MMddyy = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(now.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(now.format(MMddyy));
        LocalDate birthDay = LocalDate.parse("04/17/1994", MMddyy);
        System.out.println(birthDay);
    }
}
