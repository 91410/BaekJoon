package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Number5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){                               // 0, 0 일때까지 반복
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            if (num1 < num2 && num2 % num1 == 0){       //num1이 num2의약수일때
                bw.write("factor");
                bw.newLine();
            } else if (num1 > num2 && num1 % num2 == 0) {   // 반대상황
                bw.write("multiple");
                bw.newLine();
            } else if (num1 == 0 && num2 == 0) {    // 반복 종료
                bw.flush();
                bw.close();
                break;
            } else {                        // 아무것도 아닐때
                bw.write("neither");
                bw.newLine();
            }
        }
    }
}
