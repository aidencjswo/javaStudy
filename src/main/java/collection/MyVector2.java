package collection;

import java.util.Iterator;

/**
 * MyVector2는 MyVector를 상속하고 있으므로 컴파일을 하려면 MyVector가 필요하다.
 */
public class MyVector2 extends MyVector implements Iterator {
    //앞으로 읽어 올 요소의 위치를 저장
    int cursor = 0;
    int lastRet = -1;

    public MyVector2(int capacity){
        super(capacity);
    }
    public MyVector2(){
        this(10);
    }
    public String toString(){
        String tmp = "";
        Iterator it = iterator();

        for(int i=0; it.hasNext(); i++){
            if(i != 0) tmp+=", ";
            tmp += it.next();
        }
        return "["+tmp+"]";
    }
    public Iterator iterator(){
        cursor = 0;
        lastRet = -1;
        return this;
    }
    public boolean hasNext(){
        return cursor != size();
    }

    public Object next(){
        Object next = get(cursor);
        lastRet = cursor++;
        return next;
    }
    public void remopve(){
        if(lastRet == -1){
            throw new IllegalStateException();
        } else {
            remove(lastRet);
            cursor--;
            lastRet = -1;
        }
    }
}
