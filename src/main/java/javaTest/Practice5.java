package javaTest;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Practice5 {
    public static void main(String[] args) {
        String amount1 = "124000";

        //연산할 경우에만 인스턴스 생성
        BigDecimal change = new BigDecimal(amount1);

        change = change.add(new BigDecimal(3123));

        change = change.divide(new BigDecimal(3),4, RoundingMode.HALF_UP);

        DecimalFormat df = new DecimalFormat("###,###.###");

        String result = df.format(change);

        System.out.println("change = " + change);

        System.out.println("result = " + result);

    }
}
