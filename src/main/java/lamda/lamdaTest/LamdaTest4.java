package lamda.lamdaTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaTest4 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc","aaa","bbb","ddd","eee");
        
        
        // 람다식을 사용하지 않은것
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        //람다식으로 변경했을때
        Collections.sort(list,(o1,o2)-> o2.compareTo(o1));
    }

}
