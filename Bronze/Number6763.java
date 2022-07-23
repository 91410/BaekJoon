package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number6763 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int speedLimit = Integer.parseInt(br.readLine());                           // 속도 제한
        int speed = Integer.parseInt(br.readLine());                                // 속도

        if (speedLimit >= speed){                                                   // 속도제한 범위에 속도가 있을때
            System.out.println("Congratulations, you are within the speed limit!");
        } else if (speed - speedLimit >= 1 && speed - speedLimit < 21) {            // 20까지
            System.out.println("You are speeding and your fine is $100.");
        } else if (speed - speedLimit >= 21 && speed - speedLimit < 31) {           // 30까지
            System.out.println("You are speeding and your fine is $270.");
        } else {                                                                    // 31초과시
            System.out.println("You are speeding and your fine is $500.");
        }
    }
}
