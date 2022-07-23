package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Number10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> stack = new Stack<>();                                        // 펠린드롬 즉 뒤에서 읽어도 원래대로 읽은것이랑 같은 문자 확인
        String result = "";                                                         // 스텍을 통행 뒤에서부터 나오는 문자를 담기위해서

        String str = br.readLine();                                                 // 입력
        String strArr [] = str.split("");                                     // 입력 받은 문자를 배열에 넣기

        for (int i = 0; i < strArr.length; i++){                                    // 배열안의 문자를 순서대로 스텍에 넣기
            stack.push(strArr[i]);
        }
        for (int i = 0; i < strArr.length; i++){                                    // 스텍안의 문자를 pop를 통해 뒤에서 부터 나오게 하여 result에 담기
            result += stack.pop();
        }
        if (str.equals(result)){                                                    // 조건문을 통해 원래 입력받은 문자와 같은지 확인
            System.out.println(1);                                                  // 같으면 1
        } else {
            System.out.println(0);                                                  // 다르면 0
        }

    }
}
