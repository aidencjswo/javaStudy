package javaTest;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Practice6 {
    public static void main(String[] args) {

        String str = "100100";
        char[] charArr = str.toCharArray();

        System.out.println("str[0] = " + charArr[0]);
        System.out.println(str.length());
        System.out.println(str.charAt(0));
    }
}
