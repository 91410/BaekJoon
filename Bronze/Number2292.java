package BaekJoon.Bronze;

import java.io.*;

public class Number2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());
        int root = 1;           //  1부터 체크
        int circle = 2;         //  1을 제외 하기 때문에 2부터 시작

        if (number == 1){
            bw.write(String.valueOf(root));
        } else {
            while (circle <= number){
                circle = circle + (6 * root);           // 원이 하나 증가 하면 6, 12, 18 ... 6의 배수로 증가
                root++;
            }
            bw.write(String.valueOf(root));
        }
        bw.flush();
        bw.close();
    }
}
