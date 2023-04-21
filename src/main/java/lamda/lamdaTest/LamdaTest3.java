package lamda.lamdaTest;

public abstract class LamdaTest3 implements MyFunction {
    void aMethod(MyFunction f) {
        f.myMethod();
    }
}
