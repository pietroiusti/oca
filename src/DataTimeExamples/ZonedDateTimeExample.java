/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTimeExamples;

import java.text.NumberFormat;
import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author PietroS
 */
//    public static ZonedDateTime of(int year, int month,
//            int dayOfMonth, int hour, int minute, int second, int nanos, ZoneId zone)
//
//    public static ZonedDateTime of(LocalDate date, LocalTime time, ZoneId zone)
//
//    public static ZonedDateTime of(LocalDateTime dateTime, ZoneId zone)
public class ZonedDateTimeExample {

    public static void main(String[] args) throws ParseException {
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalTime time1 = LocalTime.of(6, 15);
        LocalDate date2 = LocalDate.of(2015, 1, 20);
        LocalDateTime dateTime1 = LocalDateTime.of(date1, time1);
        System.out.println(ZonedDateTime.now());

        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime zoned1 = ZonedDateTime.of(2015, 1, 20, 6, 15, 30, 200, zone);
        ZonedDateTime zoned2 = ZonedDateTime.of(date1, time1, zone);
        ZonedDateTime zoned3 = ZonedDateTime.of(dateTime1, zone);

        ZoneId.getAvailableZoneIds().stream()
                .filter(z -> z.contains("Africa") || z.contains("Harare"))
                .sorted().forEach(System.out::println);
//Period
        Period annually = Period.ofYears(1); // every 1 year
        Period quarterly = Period.ofMonths(3); // every 3 months
        Period everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
        Period everyOtherDay = Period.ofDays(2); // every 2 days
        Period everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 days

        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        performAnimalEnrichment(start, end);

        System.out.println(Period.of(0, 20, 47)); //P20M47D
        System.out.println(Period.ofWeeks(3)); //P21D

        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Period period = Period.ofMonths(1);
        System.out.println(date.plus(period)); // 2015–02–20
        System.out.println(dateTime.plus(period)); // 2015–02–20T06:15
//        System.out.println(time.plus(period)); // UnsupportedTemporalTypeException

//Durations
        Duration daily = Duration.ofDays(1); // PT24H
        Duration hourly = Duration.ofHours(1); // PT1H
        Duration everyMinute = Duration.ofMinutes(1); // PT1M
        Duration everyTenSeconds = Duration.ofSeconds(10); // PT10S
        Duration everyMilli = Duration.ofMillis(1); // PT0.001S
        Duration everyNano = Duration.ofNanos(1); // PT0.000000001S

        Duration daily2 = Duration.of(1, ChronoUnit.DAYS);
        Duration hourly2 = Duration.of(1, ChronoUnit.HOURS);
        Duration everyMinute2 = Duration.of(1, ChronoUnit.MINUTES);
        Duration everyTenSeconds2 = Duration.of(10, ChronoUnit.SECONDS);
        Duration everyMilli2 = Duration.of(1, ChronoUnit.MILLIS);
        Duration everyNano2 = Duration.of(1, ChronoUnit.NANOS);

        LocalTime one = LocalTime.of(5, 15);
        LocalTime two = LocalTime.of(6, 30);
        LocalDate dateC = LocalDate.of(2016, 1, 20);
        System.out.println(ChronoUnit.HOURS.between(one, two)); // 1
        System.out.println(ChronoUnit.MINUTES.between(one, two)); // 75
//        System.out.println(ChronoUnit.MINUTES.between(one, dateC)); // DateTimeException Exception in thread "main" java.time.DateTimeException: Unable to obtain LocalTime from TemporalAccessor: 2016-01-20 of type java.time.LocalDate

        Period periodD = Period.ofDays(1);
        Duration days = Duration.ofDays(1); // GOES TO HOURS
        System.out.println(date.plus(periodD)); // 2015–05–26
//        System.out.println(date.plus(days)); // Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Seconds

//Instant
        Instant now = Instant.now();
// do something time consuming
        Instant later = Instant.now();
        Duration duration = Duration.between(now, later);
        System.out.println(duration.toMillis());
        LocalDate datei = LocalDate.of(2015, 5, 25);
        LocalTime timei = LocalTime.of(11, 55, 00);
        ZoneId zonei = ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(datei, timei, zonei);
        Instant instanti = zonedDateTime.toInstant(); // 2015–05–25T15:55:00Z
        System.out.println(zonedDateTime); // 2015–05–25T11:55–04:00[US/Eastern]
        System.out.println(instanti); // 2015–05–25T15:55:00Z

//Instant instant = Instant.ofEpochSecond(epochSeconds);
//System.out.println(instant); // 2015–05–25T15:55:00Z        
        Instant nextDay = now.plus(1, ChronoUnit.DAYS);
        System.out.println(nextDay); // 2015–05–26T15:55:00Z
        Instant nextHour = now.plus(1, ChronoUnit.HOURS);
        System.out.println(nextHour); // 2015–05–25T16:55:00Z
//        Instant nextWeek = now.plus(1, ChronoUnit.WEEKS); // exception

//Accounting for Daylight Savings Time
        System.out.println("DAYLIGHT SAVING");

        LocalDate dateDSM = LocalDate.of(2016, Month.MARCH, 13);
        LocalTime timeDSM = LocalTime.of(1, 30);
        ZoneId zoneDSM = ZoneId.of("US/Eastern");
        ZonedDateTime dateTimeDSM = ZonedDateTime.of(dateDSM, timeDSM, zoneDSM);
        System.out.println(dateTimeDSM); // 2016–03–13T01:30–05:00[US/Eastern]
        dateTimeDSM = dateTimeDSM.plusHours(1);
        System.out.println(dateTimeDSM); // 2016–03–13T03:30–04:00[US/Eastern]        
        LocalDate dateds = LocalDate.of(2016, Month.NOVEMBER, 6);
        LocalTime timeds = LocalTime.of(1, 30);
        ZoneId zoneds = ZoneId.of("US/Eastern");
        ZonedDateTime dateTimeds = ZonedDateTime.of(dateds, timeds, zoneds);
        System.out.println(dateTimeds); // 2016–11–06T01:30–04:00[US/Eastern]
        dateTimeds = dateTimeds.plusHours(1);
        System.out.println(dateTimeds); // 2016–11–06T01:30–05:00[US/Eastern]
        dateTimeds = dateTimeds.plusHours(1);
        System.out.println(dateTimeds); // 2016–11–06T02:30–05:00[US/Eastern]

//Adding Internationalization and Localization
        System.out.println("Internationalization and Localization");
        Locale locale = Locale.getDefault();
        System.out.println(locale);

        System.out.println(Locale.GERMAN); // de
        System.out.println(Locale.GERMANY); // de_DE
        Locale l1 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();
        Locale l2 = new Locale.Builder()
                .setRegion("US")
                .setLanguage("en")
                .build();

//        System.out.println(Locale.getDefault()); // en_US
//        Locale.setDefault(locale); // change the default
//        System.out.println(Locale.getDefault()); // fr  
//        locale = new Locale("en", "CA");
//        ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
//        System.out.print(rb.getString("hello"));
//        System.out.print(". ");
//        System.out.print(rb.getString("name"));
//        System.out.print(" ");
//        System.out.print(rb.getString("open"));
//        System.out.print(" ");
//        System.out.print(rb.getString("visitor"));
        int attendeesPerYear = 3_200_000;
        int attendeesPerMonth = attendeesPerYear / 12;
        NumberFormat us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(attendeesPerMonth));
        NumberFormat g = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(g.format(attendeesPerMonth));
        NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println(ca.format(attendeesPerMonth));
        double price = 48;
        NumberFormat usc = NumberFormat.getCurrencyInstance();
        System.out.println(usc.format(price));
        NumberFormat en = NumberFormat.getInstance(Locale.US);
        NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);
        String sd = "40.45";
        System.out.println(en.parse(sd)); // 40.45
        System.out.println(fr.parse(sd)); // 40
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) { // check if still before end
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plusMonths(1); // add a month
        }
    }
}
