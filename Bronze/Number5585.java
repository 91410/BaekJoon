package BaekJoon.Bronze;

import java.io.*;

public class Number5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = 1000 - Integer.parseInt(br.readLine());         // 입력 값 받고, 조건에 맞게 미리 1000원의 거스름돈 설정
        int count = 0;                                              // 거스름돈 동전 갯수 설정

        if(money / 500 == 1) {                                      // 동전 단위 별로 조건 걸어서 갯수파악
            count = count + 1;
            money = money - 500;
        }
        if (money / 100 == 4) {
            count = count + 4;
            money = money - 400;
        } else if (money / 100 == 3) {
            count = count + 3;
            money = money - 300;
        } else if (money / 100 == 2) {
            count = count + 2;
            money = money - 200;
        } else if (money / 100 == 1) {
            count = count + 1;
            money = money - 100;
        }
        if (money / 50 == 1) {
            count = count + 1;
            money = money - 50;
        }
        if (money / 10 == 4) {
            count = count + 4;
            money = money - 40;
        } else if (money / 10 == 3) {
            count = count + 3;
            money = money - 30;
        } else if (money / 10 == 2) {
            count = count + 2;
            money = money - 20;
        } else if(money / 10 == 1){
            count = count + 1;
            money = money - 10;
        }
        if (money / 5 == 1) {
            count = count + 1;
            money = money - 5;
        }
        if (money / 1 == 4) {
            count = count + 4;
            money = money - 4;
        } else if (money / 1 == 3) {
            count = count + 3;
            money = money - 3;
        } else if (money / 1 == 2) {
            count = count + 2;
            money = money - 2;
        } else if (money / 1 == 1){
            count = count + 1;
            money = money - 1;
        }
        System.out.println(count);
    }
}
