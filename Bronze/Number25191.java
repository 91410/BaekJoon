package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number25191 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ck = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int cola = Integer.parseInt(st.nextToken());
        int beer = Integer.parseInt(st.nextToken());

        if (ck > (cola / 2) + beer){
            System.out.println((cola / 2) + beer);
        } else if(ck < (cola / 2) + beer) {
            System.out.println(ck);
        }
    }
}
