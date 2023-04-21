package enumStudy.enumTest;

public enum EnumSingleton {
    /**
     * enum
     * 1. 생성자가 있어야함.
     * 2. 고정된 상수들의 집합 -> 런타임이 아닌 컴파일타임에 모든 값을 알고 있어야함 -> 생성자가 private로 제한됨 (런타임 시에 값이 설정되면 안되기 때문임)
     * 2-1. 그렇기 때문에 enum클래스 내에서도 인스턴스 생성이 불가능함 -> 사용자 입장에서는 인스턴스는 없지만 선언된 enum은 존재
     */
    
    //상수 선언
    INSTANCE;
    
    //2-1 에러 (enum클래스 내에서 인스턴스 생성을 못함)
    //EnumSingleton e = new EnumSingleton();


    /**
     * enum 싱글톤의 장점
     * 1. 간단함
     * 2. Enum 싱글톤은 Serialization을 스스로 해결함
     *
     */
}
