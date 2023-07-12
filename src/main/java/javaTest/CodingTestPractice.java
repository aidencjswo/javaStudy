package javaTest;

import javax.lang.model.SourceVersion;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;
import java.util.Date;


public class CodingTestPractice {

    public static void main(String[] args) throws ParseException {

        CodingTestPractice c = new CodingTestPractice();
//        c.test1();
//        c.test2();
//        c.test3();
        c.test4();
    }
    void test1(){
        //천단위 쉼표 찍기
        BigDecimal bigDecimal = new BigDecimal(100000000);

        DecimalFormat df = new DecimalFormat("###,###");

        String result = df.format(bigDecimal);

        System.out.println("result = " + result);
    }

    void test2(){
        //날짜,시간 계산
        String str = "2023-07-08";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(str, formatter);

        int hour = 10;
        int minute = 30;
        int second = 0;

        LocalDateTime dateTime = LocalDateTime.of(date, LocalTime.of(hour, minute, second));

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String result = df.format(dateTime);

        System.out.println("d = " + result);


    }

    void test3() throws ParseException {
        String str = "20230701021030";

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

        LocalDateTime date = LocalDateTime.parse(str, dtf);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

        String result = dtf2.format(date);

        System.out.println("result = " + result);

        //10초 더하기
        TemporalAmount ta1 = Duration.ofSeconds(10);

        String result2 = dtf2.format(date.plus(ta1));

        System.out.println("result2 = " + result2);

        //100밀리세컨즈 더하기

        TemporalAmount ta2 = Duration.ofMillis(100);

        String result3 = dtf2.format(date.plus(ta2));

        System.out.println("result3 = " + result3);

        //100밀리세컨즈 빼기

        String result4 = dtf2.format(date.minus(ta2));

        System.out.println("result4 = " + result4);

        //밀리세컨즈로 표현하기(Timestamp)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

        Date date2 = sdf.parse(str);

        long mill = date2.getTime();

        System.out.println("mill = " + mill);
        System.out.println("mill = " + (mill+60000));

        Timestamp t = Timestamp.valueOf(date);


        Date result5 = new Date(mill);
        Date result6 = new Date(mill+60000);

        System.out.println("result5 = " + result5);
        System.out.println("result6 = " + result6);

    }

    void test4(){
        String str = "19941005";

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyyMMdd");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss SSS");

        LocalDate ls = LocalDate.parse(str, dtf1);

        String result1 = dtf1.format(ls);

        System.out.println("ls = " + ls);

        System.out.println("result = " + result1);

        //1초더하기
        TemporalAmount ta = Duration.ofSeconds(2);

        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        LocalDateTime ldt = LocalDateTime.of(ls, LocalTime.of(hours, minutes, seconds));

        ldt = ldt.plus(ta);

        String result2 = dtf2.format(ldt);

        System.out.println("ls = " + ldt);

        System.out.println("result2 = " + result2);
    }
}
