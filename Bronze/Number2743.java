package BaekJoon.Bronze;

import java.io.*;

public class Number2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str [] = br.readLine().split("");
        bw.write(String.valueOf(str.length));
        bw.flush();
        bw.close();
    }
}
