package BaekJoon.Bronze;

import java.io.*;
import java.util.Stack;

public class Number1259 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){                           // 입력이 0일때까지 반복
            String test = br.readLine();
            if (test.equals("0")){
                bw.flush();
                bw.close();
                break;
            }
            String testArr [] = test.split("");     // 한글자 단위로 잘라 배열
            Stack<String> stack = new Stack<>();
            for (int i = 0; i < testArr.length; i++){       // 배열을 스택으로
                stack.push(testArr[i]);
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < testArr.length; i++){       // 스택으로 뒤에서 부터 출력한 것을 스트링빌더로
                sb.append(stack.pop());
            }
            if (sb.toString().equals(test)){                // 스트링빌더와 입력받은것이 일치하는지 확인
                bw.write("yes");
                bw.newLine();
            } else {
                bw.write("no");
                bw.newLine();
            }
        }
    }
}
