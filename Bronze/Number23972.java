package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number23972 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long k = Long.parseLong(st.nextToken());
        long n = Long.parseLong(st.nextToken());
        long result = -1l;

        if(n != 1l) {
            result = (k * n) / (n - 1l);
            if ((k * n) % (n - 1l) != 0l) {
                result += 1l;
            }
        }
        System.out.println(result);
    }
}

