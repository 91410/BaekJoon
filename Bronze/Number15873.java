package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number15873 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        int sum = 0;                                    // 두수의 합
        
        if (number == 1010){                            // 조건이 0부터 10까지 두수가 둘다 10일 경우
            sum = 20;
        } else if (number % 10 == 0) {                  // 두번째 수가 10이고 첫번째수가 한자리수 일때
            sum = (number / 100) + 10;
        } else {                                        // 나머지 경우 첫번깨가 10, 두번째가 한자리수 혹은 둘다 한자리수 일때
            sum = (number / 10) + (number % 10);
        }
        System.out.println(sum);
    }
}
