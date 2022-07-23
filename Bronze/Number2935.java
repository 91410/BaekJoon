package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Number2935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger a = new BigInteger(br.readLine());           // 큰수를 받기 위해서 BigInteger 사용해서 받음
        String str = br.readLine();                             // 연산자를 문자열로 받음
        BigInteger b = new BigInteger(br.readLine());           // 큰수를 받기 위해서 BigInteger 사용해서 받음
        BigInteger result = new BigInteger("0");            // 결과 값 받을 변수 

        if (str.equals("*")){                                   // 연산자 확인 조건문에 따라 연산
            result = a.multiply(b);
            System.out.println(result);
        } else if (str.equals("+")) {
            result = a.add(b);
            System.out.println(result);
        }
    }
}
