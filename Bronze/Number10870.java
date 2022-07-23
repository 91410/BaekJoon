package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number10870 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int arr [] = new int [44];
        arr [0] = 0;
        arr [1] = 1;
        arr [2] = 1;

        for (int i = 3; i < 44; i++){
            int sum = arr[i-1] + arr[i-2];
            arr[i] = sum;
        }
        int result = arr[n];
        System.out.println(result);
    }
}
