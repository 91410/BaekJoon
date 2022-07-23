package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int factorial = 1;

        for(int i = 2; i <= n; i ++) {
            factorial *= 1 * i;
        }
        System.out.println(factorial);
    }

}
