package BaekJoon.Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Number15734 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());

        int sum = l + r + a;
        int foot = a - Math.abs(l - r);
        int result = 0;

        if (foot >= 0){
            result = sum - (foot % 2);
        } else {
            result = sum - Math.abs(foot);
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}


