package javaTest;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.TemporalAmount;

public class Practice4 {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();

        System.out.println("current = " + current);

        TemporalAmount ta = Duration.ofMillis(300);

        current.plus(ta);

        System.out.println("current = " + current.plus(ta));
    }
}
