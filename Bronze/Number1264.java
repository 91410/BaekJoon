package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){                                                               // 입력이 몆번 들어오는지 알 수 없기에 무한루프 실시
            String str = br.readLine();                                             // 입력값 받기
            if (str.equals("#")){                                                   // 무한루프 탈출 조건 작성
                break;
            }
            String strArr[] = str.split("");                                   // 입력받은 문자열을 한글자씩 잘라서 배열에  
            int count = 0;                                                          // 모음 갯수 카운트
            for (int i = 0; i < strArr.length; i++){                                // 배열의 길이 만큼 반복문 실시하여서 모음 갯수 파악
                if (strArr[i].equals("a") || strArr[i].equals("A") ){
                    count += 1;
                } else if (strArr[i].equals("e") || strArr[i].equals("E") ){
                    count += 1;
                } else if (strArr[i].equals("i") || strArr[i].equals("I") ){
                    count += 1;
                } else if (strArr[i].equals("o") || strArr[i].equals("O") ){
                    count += 1;
                } else if (strArr[i].equals("u") || strArr[i].equals("U") ){
                    count += 1;
                }
            }
            System.out.println(count);
        }
    }
}
