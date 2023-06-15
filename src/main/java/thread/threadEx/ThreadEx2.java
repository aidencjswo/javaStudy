package thread.threadEx;

public class ThreadEx2 {
    public static void main(String[] args) {
        ThreadEx2_1 t1 = new ThreadEx2_1();
        ThreadEx2_2 t2 = new ThreadEx2_2();

        t2.setName("지원이-----");
        t2.start();
        Thread.currentThread().getName();

    }
}

class ThreadEx2_1 extends Thread{
    public void run(){
        throwException();
    }
    public void throwException(){
        try{
            throw new Exception();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class ThreadEx2_2 extends Thread{
    @Override
    public void run(){
        for(int i = 0 ; i < 100 ; i++){
            System.out.println("지원이");
        }
    }
}