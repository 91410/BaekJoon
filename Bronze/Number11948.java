package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number11948 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());
        int scSum = 0;

        int science[] = new int[] {a, b, c, d};
        Arrays.sort(science);
        scSum = science[1] + science[2] + science[3];

        if(e > f){
            System.out.println(scSum+e);
        }else {
            System.out.println(scSum+f);
        }
    }
}