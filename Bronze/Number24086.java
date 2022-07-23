package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number24086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());        // 1년전 키
        int b = Integer.parseInt(br.readLine());        // 현재 키

        System.out.println(b-a);                        // 1년전과의 차이
    }
}
