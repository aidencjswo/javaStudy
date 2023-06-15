package annotation.annotationTest;

import java.util.ArrayList;

public class ETCAnnotation {
    /**
     * @FunctionalInterface : 함수형 인터페이스를 선언할 때, 컴파일러가 함수형 인터페이스를 올바르게 선언했는지 확인함.
     */
    @FunctionalInterface
    public interface Runnable{
        public abstract void run();
    }
    /**
     * @SuppressWarnings : 컴파일러에서 보여주는 경고 메시지를 안보이게 해줌
     * 세부 속성 : deprecation, unchecked, rawtypes, varargs
     *  deprecation : @Deprecated 경고 무시
     *  unchecked : 제네릭 타입 지정 않았을 때 경고
     *  rawtypes : 제네릭 사용 하지 않았을 때 경고
     *  varargs : 가변인자의 타입이 제네릭 타입일 때 발생 하는 경고
     */
    public static void main(String[] args) {
     @SuppressWarnings({"unchecked","unchecked","varargs"})
     ArrayList list = new ArrayList();
    }
}
