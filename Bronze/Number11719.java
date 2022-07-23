package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number11719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;                          // 출력과 조건 설정을 위한 변수

        while((str = br.readLine()) != null){       // 입력이 없으면 반복문 종료, "" -> 빈줄로 출력
            System.out.println(str);
        }
    }
}

