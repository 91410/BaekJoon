package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Number12605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());         // 테스트 몇번 할건지 결정

        for (int i = 1; i <= testCase; i++){                    // 테스트 번수 만큼 반복, 출력시 순번때문데 필요
            String strArr [] = br.readLine().split(" ");  // 띄어쓰기 단위로 배열로 넣기
            Stack<String> stack = new Stack<>();                // 후입선출인 스택을 이용하기 위해서
            StringBuilder sb = new StringBuilder();             // 스택에서 pop한 문자를 한줄로 출력하기 위해서
            for (int j = 0; j < strArr.length; j++) {           // 배열의 문자를 스택에 넣기
                stack.push(strArr[j]);
            }
            for (int k = 0; k < strArr.length; k++){            // pop을 통해서 뒤에서 부터 나오고 그것을 스트링빌더에 넣어주기
                sb.append(stack.pop());
                if (stack.size() != 0){                         // 마지막에는 뛰어쓰기가 없기 때문에 조건문 설정
                    sb.append(" ");
                }
            }
            System.out.println("Case #" + i + ": " + sb);
        }
    }

}
