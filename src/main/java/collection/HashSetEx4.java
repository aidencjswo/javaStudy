package collection;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;

public class HashSetEx4 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(new String("abc"));
        set.add(new String("abc"));
        set.add(new Person2("David1",10));
        set.add(new Person2("David2", 11));
        System.out.println(set);

    }
}
class Person2{
    String name;
    int age;


    //저장된 객체를 HashSet으로 추가하려면 equals()랑 hashCode()를 오버라이딩 해야한다. -> 주소값이 다르기 때문에 바르게 동작하지 않음.
    Person2(String name, int age){
        this.name = name;
        this.age = age;
    }


    //equals()를 오버라이딩해서 비교 후에 hash값 true false를 반환
    public boolean equals(Object obj){
        if(obj instanceof Person2){
            //Person2로 캐스팅
            Person2 tmp = (Person2)obj;
            //Person2가 가지고 있는 name과 obj로 받은 name을 비교
            return this.name.equals(tmp.name) && this.age==tmp.age;
        }
        return false;
    }
    //hashCode를 오버로딩 하여 사용하여야 한다.
    public int hashCode(){
        // int hash(Object... values); //가변인자
        return (name+age).hashCode();
    }
    public String toString(){
        return name +":"+ age;
    }
}