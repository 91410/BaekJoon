package BaekJoon.Bronze;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Number8545 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> stack = new Stack<>();                        // 역순 출력이기에 후입선출인 스택 사용
        String strArr [] = br.readLine().split("");             // 입력들어오는 즉시 한글자로 잘라서 배열

        for (int i = 0; i < strArr.length; i++){                    // 스택에 push
            stack.push(strArr[i]);
        }
        for (int i = 0; i < strArr.length; i++){                    // 스택에서 출력
            System.out.print(stack.pop());
        }

//        String str [] = br.readLine().split("");                // 입력들어오는 즉시 한글자로 잘라서 배열
//
//        for (int i = str.length-1; i >= 0; i--){                // 배열 크기보다 1 작게 하여 뒤에서 부터 출력
//            System.out.print(str[i]);
//        }
    }
}
