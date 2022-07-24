package Bronze;

import java.io.*;

public class Number4458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());         // 입력 갯수

        for (int i = 0; i < testCase; i++){                     // 입력만큼 반복
            String str = br.readLine();
            bw.write(str.substring(0,1).toUpperCase() + str.substring(1));  // 첫문자를 짤라서 대문자로 변경하고 그 뒤 문장 합치고 출력
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
