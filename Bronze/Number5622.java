package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strArr [] = br.readLine().split("");                                             // 입력받은 문자를 한글자단위로 잘라서 배열
        int count = 0;                                                                                // 입력받은 문자 시간 카운트

        for (int i = 0; i < strArr.length; i++){                                                      // 입력받은 문자 크기만큼 반복문
            if (strArr[i].equals("A") || strArr[i].equals("B") || strArr[i].equals("C")){
                count = count + 3;
            } else if (strArr[i].equals("D") || strArr[i].equals("E") || strArr[i].equals("F")) {
                count = count + 4;
            } else if (strArr[i].equals("G") || strArr[i].equals("H") || strArr[i].equals("I")) {
                count = count + 5;
            } else if (strArr[i].equals("J") || strArr[i].equals("K") || strArr[i].equals("L")) {
                count = count + 6;
            } else if (strArr[i].equals("N") || strArr[i].equals("M") || strArr[i].equals("O")) {
                count = count + 7;
            } else if (strArr[i].equals("P") || strArr[i].equals("Q") || strArr[i].equals("R") || strArr[i].equals("S")) {
                count = count + 8;
            } else if (strArr[i].equals("T") || strArr[i].equals("U") || strArr[i].equals("V")) {
                count = count + 9;
            } else if (strArr[i].equals("W") || strArr[i].equals("X") || strArr[i].equals("Y") || strArr[i].equals("Z")) {
                count = count + 10;
            }
        }
        System.out.println(count);
    }
}
