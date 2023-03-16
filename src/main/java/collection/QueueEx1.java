package collection;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx1 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;
    public static void main(String[] args) {
        System.out.println(">>");
        while(true){
            try{
                Scanner s = new Scanner(System.in);
                //nextLine().trim() 메소드 - 문자열의 앞뒤 공백을 제거해줌
                String input = s.nextLine().trim();

                if("".equals(input)){
                    continue;
                }
                //equalsIgnoreCase() - 문자열을 대/소문자 구분없이 비교함
                if(input.equalsIgnoreCase("q")){
                    //console 입력창에서 나감
                    System.exit(0);
                }else if(input.equalsIgnoreCase("help")){
                    System.out.println(" help - 도움말을 보여줍니다.");
                    System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println(" history - 최근에 입력한 명령어를 "+MAX_SIZE+"개 보여줍니다.");
                }else if(input.equalsIgnoreCase("history")){
                    int i=0;
                    save(input);
                    //Queue를 LinkedList로 캐스팅하여 tmp에 참조시킨다.
                    LinkedList tmp = (LinkedList)q;
                    //Iterator를 만듦
                    ListIterator it = tmp.listIterator();
                    //출력
                    while(it.hasNext()){
                        System.out.println(++i+"."+it.next());
                    }
                }else{
                    //아래 구현 된 메소드
                    save(input);
                    System.out.println(input);
                }
            }catch(Exception e){
                System.out.println("입력 오류 입니다.");
            }
        }
    }
    public static void save(String input){
        //입력된 문자가 공백이 아닐경우 Queue에 객체를 저장한다. return 타입은 boolean임
        if(!"".equals(input)){
            q.offer(input);
        }
        //Queue의 길이가 MAX_SIZE를 넘으면 객체를 꺼내서 반환한다.
        if(q.size() > MAX_SIZE){
            q.remove();
        }
    }
}
