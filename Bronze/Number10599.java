
package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number10599 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int c = Integer.parseInt(str[2]);
            int d = Integer.parseInt(str[3]);

            if (a == 0 && b == 0 && c == 0 && d == 0)
                break;

            int max = d - a;
            int min = c - b;

            System.out.println(min + " " + max);
        }
    }
}