package collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetLotto {
    public static void main(String[] args) {
        Set set = new TreeSet();

        for(int i=0;set.size()<6;i++){
            /**
             * Math.random() 함수는 0.0부터 0.9999999 까지의 숫자를 뽑아내기 때문에
             * 예를 들어 1부터 100까지의 숫자를 뽑고 싶다면
             * 1. Math.random() * 100 -> 0 ~ 99.9999
             * 2. (int)Math.random()으로 정수형으로 캐스팅 소수점은 버림 처리 된다.
             * 3. 0~99까지의 숫자를 구했으므로 +1 을 한다. -> 1~100까지의 숫자를 뽑을 수 있다.
             */
            int num=(int)(Math.random()*45)+1;
            set.add(num); //set.add(new Integer(num));
        }

        System.out.println(set);
    }
}
