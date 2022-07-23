package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Number2789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        ArrayList<String> removedStr = new ArrayList<>();           // 검열문자를 제외하고 검영안된 문자만 넣어두기 위해서
//        String strArr [] = br.readLine().split("");
//
//        for (int i = 0; i < strArr.length; i++){        // 검열문자를 지정하여서 제거한 후 리스트에 추가
//            if (strArr[i].equals("C") || strArr[i].equals("A") || strArr[i].equals("M") || strArr[i].equals("B") || strArr[i].equals("R")
//            || strArr[i].equals("I") || strArr[i].equals("D") || strArr[i].equals("G") || strArr[i].equals("E")){
//            } else {
//                removedStr.add(strArr[i]);
//            }
//        }
//        for (int i = 0; i < removedStr.size(); i++){    // 반복문을 통해 리스트 출력
//            System.out.print(removedStr.get(i));
//        }
        String remove = "";
        String strArr [] = br.readLine().split("");

        for (int i = 0; i < strArr.length; i++){
            if (strArr[i].equals("C") || strArr[i].equals("A") || strArr[i].equals("M") || strArr[i].equals("B") || strArr[i].equals("R")
            || strArr[i].equals("I") || strArr[i].equals("D") || strArr[i].equals("G") || strArr[i].equals("E")) {
            } else {
                remove += strArr[i];
            }
        }
        System.out.println(remove);
    }
}
