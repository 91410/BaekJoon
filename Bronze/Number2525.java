package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int workMin = Integer.parseInt(br.readLine());

        int sumMin = min + workMin;
        int hourPlus = sumMin / 60;
        int minPlus = sumMin % 60;

        if (hourPlus == 0){
            System.out.println(hour + " " + sumMin);
        } else if (hourPlus >= 1 ){
            if (hour + hourPlus >= 24){
                int hourZero = hourPlus - (24 - hour);
                min = 0;
                min += minPlus;
                System.out.println(hourZero + " " + min);
            } else {
                hour += hourPlus;
                min = 0;
                min += minPlus;
                System.out.println(hour + " " + min);
            }
        }
    }
}
