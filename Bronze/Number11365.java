package Bronze;

import java.io.*;
import java.util.Stack;

public class Number11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<String> strStack = new Stack<>();         // 한줄마다 뒤에서 부터 출력하기 위해서

        while (true){
            String line = br.readLine();

            if (line.equals("END")){                // END 입력시 종료
                bw.flush();
                bw.close();
                break;
            }
            String strArr [] = line.split("");      // 한글자마다 잘라서 스택에 추가
            for (int i = 0; i < strArr.length; i++){
                strStack.add(strArr[i]);
            }
            for (int i = 0; i < strArr.length; i++){    // 뒤에서 부터 출력
                bw.write(strStack.pop());
            }
            bw.newLine();
        }

    }
}
