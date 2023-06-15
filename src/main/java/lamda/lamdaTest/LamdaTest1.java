package lamda.lamdaTest;

import java.util.Arrays;

public class LamdaTest1 {
    public static void main(String[] args) {
        /**
         * 람다식 특징
         * 1.
         *
         *
         *
         *
         *
         *
         * 메서드와 람다의 차이점?
         * 1. 메서드는 함수와 같은 의미이지만, 특정 클래스에 반드시 속해야 한다는 제약이 있기 때문에
         *    기존의 함수라는 단어를 사용하기가 어려웠다.
         *
         * 2. 람다식은 메서드가 하나의 독립적인 기능을 하기 때문에 함수라는 용어를 사용하게 되었다.
         */

        /*
        일반 메서드 작성
        String "메소드명"("매개변수"){ 실행부 }

        람다식 작성
        ("매개변수") -> { 실행부 }
         */

    }
    //EX1) 메서드 작성
    int max(int a, int b){
        return a > b ? a : b;
    }
    //EX1) 람다식으로 작성
//    (int a,int b) -> {
//        return a>b?a:b;
//    }
}
