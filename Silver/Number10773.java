package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Number10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int result = 0;                                                             // 결과값을 더하여 출력하기 위해서

        int test = Integer.parseInt(br.readLine());                                 // 스텍에 입력할 번수

        for (int i = 0; i < test; i++){                                             // 반복문을 통해서 스택에 넣어주고 0일시에는 pop으로 빼기
            int input = Integer.parseInt(br.readLine());
            if (input != 0){
                stack.push(input);
            } else {
                stack.pop();
            }
        }
        while (stack.size() != 0){                                                  // 정확한 스택의 크기를 모르기에 while문을 사용
            result += stack.pop();
        }
        System.out.println(result);
    }
}
