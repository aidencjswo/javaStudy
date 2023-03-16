package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysTest1 {
    public static void main(String[] args) {
        //Arrays는 클래스이다.
        //같은 기능의 메소드가 배열의 타입만 다르게 오버로딩되어 있음
        /**
         * 배열의 복사 - copyOf(), copyOfRange()
         */
        int[] arr = {0,1,2,3,4};
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println(arr2);

        /**
         * 배열 채우기 - fill(), setAll()
         * 배열의 모든 요소를 지정된 값으로 채운다.
         */
        int[] arr3 = new int[5];
        Arrays.fill(arr3,9);
        //Arrays.setAll(arr3,()->(int)(Math.random()*5)+1);

        /**
         * 배열의 정렬과 검색 - sort(), binarySearch()
         */
        int[] arr4 = {3,2,0,1,4};
        int idx1 = Arrays.binarySearch(arr,2);

        Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr4));
        int idx2 = Arrays.binarySearch(arr4,2);

        /**
         * 배열의 비교와 출력 - equals(), toString()
         */
        int[] arr5 = {0,1,2,3,4};
        int[][] arr2D = {{11,12},{21,22}};
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.deepToString(arr2D));

        String[][] str2D = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
        String[][] str2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
        //다차원 비교는 불가능 하므로 false
        //이유는 배열에 저장된 배열의 주소를 비교하기 때문이다.
        System.out.println(Arrays.equals(str2D,str2D2));
        System.out.println(Arrays.deepEquals(str2D,str2D2)); //true

        /**
         * 배열을 List로 변환 - asList(Object... a)
         * 매개변수는 가변 인수이기 때문에 배열을 생성하지 않고 요소를 나열할 수 있다.
         */
        List list1 = Arrays.asList(new Integer[]{1,2,3,4,5});
        List list2 = Arrays.asList(1,2,3,4,5);
        //에러 발생 - asList()가 반환한 List의 크기는 변경할 수 없다.
        //list1.add(6);
        //크기를 변경 할 수 있는 List를 만들고 싶다면
        List list3 = new ArrayList(Arrays.asList(1,2,3,4,5));

        /**
         * parallelXXX(), spliterator(), stream() -> ArraysEx 예제
         */
    }
}
