package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number5988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++){
            String arr [] = br.readLine().split("");
            if (Integer.parseInt(arr[arr.length-1]) % 2 == 0){
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}
