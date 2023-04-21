package lamda.lamdaTest;

public class LamdaTest2 {
    public static void main(String[] args) {

    }
    //..ex1
    int max(int a, int b){
        return a>b?a:b;
    }
   //(int a,int b)->{return a>b?a:b}

    //..ex2
    void printVar(String name,int i){
        System.out.println(name+"="+i);
    }
//    (String name, int i)->{
//        System.out.println(name+"="+i);
//    }

    //..ex3
    int square(int x){
        return x * x;
    }
    //(int x)->{x*x};

    //..ex4
    int roll(){
        return (int)(Math.random()*6);
    }

    //()->{return (int)(Math.random()*6);}

    //..ex5
    int sumArr(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }

//    (int[] arr)->{
//        int sum = 0;
//        for(int i : arr){
//            sum += i;
//        }
//    }
}
