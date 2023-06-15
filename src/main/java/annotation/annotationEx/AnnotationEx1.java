package annotation.annotationEx;

public class AnnotationEx1 {

}

class Parent{
    void parentMethod(){}
}

class Child extends  Parent{
    @Override
    //void parentmethod(){ } <- 조상 메서드의 이름을 잘못 적음.
    void parentMethod(){ }
}

class NewClass{
    int newField;

    int getNewField(){
        return newField;
    }

    /**
     * 더 이상 사용하지 않을 것을 권고 하는 어노테이션
     * -> 사용을 못하는 것은 아니다!
     */
    @Deprecated
    int oldField;

    @Deprecated
    int getOldField(){
        return oldField;
    }
}
