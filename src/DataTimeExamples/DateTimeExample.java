/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTimeExamples;

import java.time.*;
import java.time.format.*;

/**
 *
 * @author PietroS
 */
public class DateTimeExample {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date2, time)
                .minusDays(1).minusHours(10).minusSeconds(30);

        System.out.println(dateTime);
        Period everyYearAndAWeek = Period.of(1, 0, 7);

        System.out.println(date);
        System.out.println(date.plus(everyYearAndAWeek));
        System.out.println(date.minus(everyYearAndAWeek));

        System.out.println(date.getDayOfWeek()); // MONDAY
        System.out.println(date.getMonth()); // JANUARY
        System.out.println(date.getYear()); // 2020
        System.out.println(date.getDayOfYear()); // 20
        System.out.println(dateTime
                .format(DateTimeFormatter.ISO_LOCAL_DATE));

        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        DateTimeFormatter shortDateTime
                = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        System.out.println(shortDateTime.format(dateTime)); // 1/20/20
        System.out.println(shortDateTime.format(date)); // 1/20/20
//System.out.println(shortDateTime.format(time)); // UnsupportedTemporalTypeException

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate date3 = LocalDate.parse("01 02 2015", f);
        LocalTime time3 = LocalTime.parse("11:22");
        System.out.println(date3); // 2015-01-02
        System.out.println(time3); // 11:22

        f = DateTimeFormatter.ofPattern("dd MM yyyy HH:mm");
        LocalDateTime datet = LocalDateTime.parse("01 02 2015 18:55", f);
        System.out.println(datet); // 2015-01-02        

//OCP
        System.out.println(ZonedDateTime.now());

    }
}
