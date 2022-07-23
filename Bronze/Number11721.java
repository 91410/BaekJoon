package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Number11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<String> alpa = new LinkedList<String>();                              // 배열의 문자를 담아서 하나씩 제거하면서 출력할려고 선택
        String str [] = br.readLine().split("");                              // 입력받을 문자열을 한글자씩 자르고 배열에 넣기위해

        for (int i = 0; i < str.length; i++){                                       // 배열의 문자를 큐에 널기위해서 작성
            alpa.add(str[i]);
        }
        for (int i = 0; i <= Math.ceil((str.length) / 10); i++){                    // 총글자수 확인하기 위해서 즉 11글자면 2번 23글자면 3번 돌리기 위해서
            String ten = "";                                                        // 문자를 열글자씩 담아서 출력하기 위해서 
            for (int j = 0; j < 10; j++){                                           // 열글자씩 반복문 돌려서 출력
                if(alpa.size() == 0){                                               // 큐는 공백이 null로 출력되기에 출력 방지 차원에서 크기가 0이면 반복문 탈출하기위해
                    break;
                }
                ten += alpa.poll();                                                 // poll로 먼저들어온것 부터 제거하면서 ten으로 담기
            }
            System.out.print(ten);
            System.out.println("");
        }
    }
}
