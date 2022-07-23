package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2902 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strArr [] = br.readLine().split("-");                        // 구분을 - 단위로 하기에 구분자로 설정하여 배열에 넣기
        String result = "";                                                       // 결과 값 출력용

        for (int i = 0; i < strArr.length; i++){                                    // 배열의 길이만큼 반복문 설정
            result += strArr[i].substring(0,1);                                     // - 단위의 앞글자만 필요하기에 substring을 이용해서 필요한 것만 추출
        }
        System.out.println(result);
    }
}
