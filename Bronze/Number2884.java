package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (h == 0 && m -45 < 0){
            h = 23;
            m = m + (60 - 45);
            System.out.println(h + " " + m);
        } else if (m - 45 < 0) {
            h = h - 1;
            m = m + (60 - 45);
            System.out.println(h + " " + m);
        } else if (m - 45 >= 0) {
            m = m - 45;
            System.out.println(h + " " + m);
        }
    }
}
