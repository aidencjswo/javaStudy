package javaTest;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAmount;

public class CodingTestPratice3 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2023, 07, 03, 11, 30, 00);

        TemporalAmount ta = Duration.ofMillis(300);

        ldt = ldt.plus(ta);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss SSS");

        String result = dtf.format(ldt);

        System.out.println("result = " + result);

    }
}
