package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Number22193 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");           // 한 줄의 입력을 구분자를 통해 분리
        int a = Integer.parseInt(st.nextToken());                                       
        int b = Integer.parseInt(st.nextToken());
        BigInteger c = new BigInteger(br.readLine());                                // a, b 의 크기가 int를 초과할수 있기 때문에 BigInteger 연산 
        BigInteger d = new BigInteger(br.readLine());

        System.out.println(c.multiply(d));                                          // BigInteger 곱 연산
    }
}
