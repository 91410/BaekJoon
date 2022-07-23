package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Number11034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){                       // 횟수가 정해짖지 않았기에 무한반복 수행
            String jump = br.readLine();
            if (jump == null){              // 입력이 없으면 종료
                bw.flush();
                bw.close();
                break;
            }
            String jumpArr [] = jump.split(" ");    // 문자열을 잘라서 배열에 추가

            int one = Integer.parseInt(jumpArr[1]) - Integer.parseInt(jumpArr[0]) - 1;  // 간격 파악
            int two = Integer.parseInt(jumpArr[2]) - Integer.parseInt(jumpArr[1]) - 1;

            if (one > two){
                bw.write(String.valueOf(one));
                bw.newLine();
            } else {
                bw.write(String.valueOf(two));
                bw.newLine();
            }
        }
    }
}
