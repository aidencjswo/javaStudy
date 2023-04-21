package lamda.lamdaTest;


/**
 * 람다식을 다루기 위한 인터페이스를 '함수형 인터페이스'라고 한다.
 * 1. 함수형 인터페이스에는 단 하나의 추상 메서드만 정의되어 있어야 한다.
 */
@FunctionalInterface
public interface MyFunction {
    void myMethod();

}