package day14constructorsdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTime {
    public static void main(String[] args) {
        //icinde bulundugumuz zaman dilimindeki tarihi verir.
        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate);
        System.out.println(myCurrentDate.getDayOfMonth());
        System.out.println(myCurrentDate.getDayOfYear());
        System.out.println(myCurrentDate.getMonth());
        System.out.println(myCurrentDate.getDayOfWeek());
        System.out.println(myCurrentDate.getChronology());
        System.out.println(myCurrentDate.getDayOfWeek());

        //ileriki tarihe nasıl gidilir?
        System.out.println(myCurrentDate.plusYears(2).plusMonths(5).plusMonths(7));

        //gecmise nasil gidilir?
        System.out.println(myCurrentDate.minusDays(14).minusWeeks(7).minusYears(10));

        //specific bir tarih objesi nasil olusturulur?
        System.out.println(LocalDate.of(2024, 4, 12));
    }
}
