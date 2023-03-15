package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
    public static void main(String[] args) {
        final int LIMIT = 10; //자르고자 하는 글자의 개수를 지정
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
        int length = source.length();

        List list = new ArrayList(length/LIMIT+10);
        /**
         * 첫번째 : i = 0
         *  i(0)+10 < length 이면 문자열을 i번째부터 i+10번째까지 잘라서 list에 담는다.
         * 두번째 : i = 10
         *  i(10)+10 < length
         * 세번째 : i = 20
         * 네번째 : i = 30
         *  i(30)+10 == 40이므로
         *  i+LIMIT < length를 만족하지 못하므로 i번째부터 나머지를 출력해준다.
         */
        for(int i=0;i<length;i+=LIMIT){
            System.out.println(i);
            if(i+LIMIT < length){
                //substring(int i,int j) 매개변수 두개짜리는 i번째부터 j까지를 리턴해준다. return type : String
                list.add(source.substring(i,i+LIMIT));
            }else{
                //substring(int i) 매개변수 하나짜리는 i번째부터 끝까지를 리턴해준다. return type : String
                list.add(source.substring(i));
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
