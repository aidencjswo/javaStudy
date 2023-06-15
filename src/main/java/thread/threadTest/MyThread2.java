package thread.threadTest;


/**
 * Runnable 인터페이스는 run() 추상메서드만 정의 되어있다.
 */
public class MyThread2 implements Runnable{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
