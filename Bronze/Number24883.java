package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number24883 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();

        if(a.equals("N") || a.equals("n")){
            System.out.println("Naver D2");
        } else{
            System.out.println("Naver Whale");
        }
    }
}
