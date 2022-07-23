package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int a = 0;

        String arr [] = str.split("");

        for (int i = 0; i < n; i++){
            a += Integer.parseInt(arr[i]);
        }
        System.out.println(a);
    }
}
