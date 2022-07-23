package BaekJoon.Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Number2420 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        long seunghwan = Long.parseLong(st.nextToken());
        long kyuhyun = Long.parseLong(st.nextToken());

        long gap = Math.abs(seunghwan - kyuhyun);           // Math.abs 절대값

        bw.write(String.valueOf(gap));
        bw.flush();
        bw.close();
    }
}
