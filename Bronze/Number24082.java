package BaekJoon.Bronze;

import java.io.*;

public class Number24082 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());
        int cube = number * number * number;                // 세제곱을 하기위해서 Math.pow는 더블이라서 소수점 나와서

        bw.write(String.valueOf(cube));
        bw.flush();
        bw.close();
    }
}
