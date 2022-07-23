package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number15667 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int a = n - 1;

        for(int i = 1; i < a; i++){
            if(a == i * (i + 1) ){
                System.out.println(i);
            }
        }
    }
}
