package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number23795 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;

        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n != -1){
                result += n;
            } else if(n == -1){
                break;
            }
        }
        System.out.println(result);
    }
}
