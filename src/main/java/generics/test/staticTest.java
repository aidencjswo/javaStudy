package generics.test;

public class staticTest {
    static int num = 1;
    int num2 = 2;

    public static void main(String[] args) {
        abs a = new abs();
        a.method1();
    }
}

class abs{
    void method1(){
        //static 변수 : 인스턴스를 생성하지 않고 사용 가능
        System.out.println(staticTest.num);
        
        //인스턴스 변수 : 인스턴스를 생성해야 사용 가능
        staticTest s = new staticTest();
        System.out.println(s.num2);
    }
}

