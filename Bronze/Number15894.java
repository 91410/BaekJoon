package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number15894 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(Long.parseLong(br.readLine()) * 4);
    }
}

// 1 -> 변의 갯수 = 4개, 2일때 8개, 3일때 12개 / 4의 배수로 증가