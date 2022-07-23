package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Number10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> stack = new Stack<>();                                            // 스액 선언

        int testCase = Integer.parseInt(br.readLine());                                 // 테스트 할 갯수 입력

        for (int i = 0; i < testCase; i++){                                             // 테스트 번수만큼 반복
            String temp = br.readLine();                                                // 명령 문자로 받음
            if (temp.contains("push")){                                                 // push 관련, 문자 숫자로 오기에 스플릿으로 나누어서 진행
                String push [] = temp.split(" ");
                stack.push(push[1]);
            } else if (temp.equals("top")) {                                            // top 관련
                if (stack.size() == 0){
                    System.out.println(-1);
                } else if (stack.size() != 0) {
                    System.out.println(stack.peek());
                }
            } else if (temp.equals("size")) {                                           // size 관련
                System.out.println(stack.size());
            } else if (temp.equals("empty")) {                                          // empty 관련
                if (stack.size() == 0){
                    System.out.println(1);
                } else if (stack.size() != 0) {
                    System.out.println(0);
                }
            } else if (temp.equals("pop")) {                                            // pop 관련
                if (stack.size() == 0){
                    System.out.println(-1);
                } else if (stack.size() != 0) {
                    System.out.println(stack.pop());
                }
            }
        }
    }
}
