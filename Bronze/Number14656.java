package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number14656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int arr [] = new int[n];
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] != (i + 1)){
                count = count +1;
            }
        }
        System.out.println(count);
    }
}