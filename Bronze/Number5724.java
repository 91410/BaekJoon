package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number5724 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int n = Integer.parseInt(br.readLine());
            int result = 0;

            if(n == 0){
                break;
            }

            for (int i = 1; i <= n; i++){
                result += (int)Math.pow(i, 2);
            }
            System.out.println(result);
        }
    }
}