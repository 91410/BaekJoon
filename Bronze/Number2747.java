package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Number2747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> fiboArr = new ArrayList<>();                             // 피보나치 수열을 넣어줄 수열
        int n = Integer.parseInt(br.readLine());                                    // 수열의 몇번째 값 입력

        fiboArr.add(0);                                                             // 처음 입력 부분
        fiboArr.add(1);
        fiboArr.add(1);

        for(int i = 3; i <= n; i++) {                                               // 3번째 항부터 반복작업 수행
            fiboArr.add(fiboArr.get(i-1) + fiboArr.get(i - 2));
        }
        System.out.println(fiboArr.get(n));
    }
}
