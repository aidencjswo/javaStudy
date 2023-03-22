package generics.test;


/**
 * 지네릭스 클래스 사용하는 방법
 */

/**
 * 임의 변수 T를 지정 T는 Type Variable의 T를 따온것임
 * @param <T>
 */
public class Box<T> {
    T item;
    void setItem(T item) {
        this.item = item;
    }
    T getItem(){
        return item;
    }

    public static void main(String[] args) {
        test.method1();
    }
}

class test{
    static void method1(){
        Box<String> b = new Box();
        b.setItem("ABC");
        String item = b.getItem();
        System.out.println(item);
    }
}
