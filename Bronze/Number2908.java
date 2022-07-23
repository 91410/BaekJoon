package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int n1 = n / 100;
        int n2 = (n / 10) - (n1 * 10);
        int n3 = n - (n1 * 100) - (n2 * 10);
        int nEnd = (n3 * 100) + (n2 * 10) + n1;

        int m1 = m / 100;
        int m2 = (m / 10) - (m1 * 10);
        int m3 = m - (m1 * 100) - (m2 * 10);
        int mEnd = (m3 * 100) + (m2 * 10) + m1;

        if (nEnd > mEnd){
            System.out.println(nEnd);
        } else {
            System.out.println(mEnd);
        }
    }
}
