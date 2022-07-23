package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;

        int abc = a * b * c;
        String num [] = String.valueOf(abc).split("");

        for (int i = 0; i < num.length; i ++){
            switch (num[i]){
                case "0" : num[i].equals(0);
                    count0 += 1;
                    break;
                case "1" : num[i].equals(1);
                    count1 += 1;
                    break;
                case "2" : num[i].equals(2);
                    count2 += 1;
                    break;
                case "3" : num[i].equals(3);
                    count3 += 1;
                    break;
                case "4" : num[i].equals(4);
                    count4 += 1;
                    break;
                case "5" : num[i].equals(5);
                    count5 += 1;
                    break;
                case "6" : num[i].equals(6);
                    count6 += 1;
                    break;
                case "7" : num[i].equals(7);
                    count7 += 1;
                    break;
                case "8" : num[i].equals(8);
                    count8 += 1;
                    break;
                case "9" : num[i].equals(9);
                    count9 += 1;
                    break;
            }
        }
        System.out.println(count0);
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count4);
        System.out.println(count5);
        System.out.println(count6);
        System.out.println(count7);
        System.out.println(count8);
        System.out.println(count9);
    }
}
