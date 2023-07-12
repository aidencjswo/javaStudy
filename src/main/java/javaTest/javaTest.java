package javaTest;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class javaTest {


    public static void main(String[] args) {

        String[] arr = new String[]{"02","05","08","11","14","17","20","23"};

        LocalDateTime current = LocalDateTime.now();

        DateTimeFormatter dtfDt = DateTimeFormatter.ofPattern("yyyyMMdd");
        DateTimeFormatter dtfTm = DateTimeFormatter.ofPattern("HH");

        String currentDt = dtfDt.format(current);
        String currentTm = dtfTm.format(current);

        System.out.println("currentDt = " + currentDt);
        System.out.println("currentTm = " + currentTm);

        String result = "";

        for(int i = 0 ; i<arr.length;i++){
            if(arr[i].equals(currentTm)){
                result = arr[i];
            }else if(i==arr.length-1 && !arr[i].equals(currentTm)){
                for(String s : arr){
                    if(Integer.parseInt(s)<Integer.parseInt(currentTm)){
                        result = s;
                    }else if(currentTm.equals("00") || currentTm.equals("01")){
                        result = "23";
                    }
                }
            }
        }

        System.out.println("result = " + result);

    }
    String getTime(String[] arr, LocalDateTime date){
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i].equals(date)){
                return arr[i];
            }else if(i==arr.length-1 && arr[i].equals(date)){

            }
        }


        return null;
    }
}
