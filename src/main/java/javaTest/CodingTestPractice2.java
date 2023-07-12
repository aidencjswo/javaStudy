package javaTest;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAmount;
import java.util.Date;


public class CodingTestPractice2 {

    public static void main(String[] args) throws ParseException {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss SSS");

        //2023-07-11
        LocalDate ld = LocalDate.of(2023, 07, 11);

        LocalDateTime ldt2 = LocalDateTime.of(ld, LocalTime.of(12, 00));

        TemporalAmount ta = Duration.ofMillis(1000);

        ldt2 = ldt2.plusYears(3);
        ldt2 = ldt2.plusDays(10);
        ldt2 = ldt2.plusHours(3);
        ldt2 = ldt2.plusMinutes(20);
        ldt2 = ldt2.plusSeconds(30);
        ldt2 = ldt2.plus(ta);

        ldt2 = ldt2.plusMonths(3);
        ldt2 = ldt2.plusWeeks(3);

        Timestamp ts = Timestamp.valueOf("2023-04-04 12:22:22");

        System.out.println("ts = " + ts.getTime());
        System.out.println("ts = " + (ts.getTime()+30L));

        long mill = ts.getTime();

        Date date = new Date(mill);

        System.out.println("ldt2 = " + dtf.format(ldt2));

        System.out.println("date = " + date);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(sdf.format(date));

    }
}
