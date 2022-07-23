package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Number2711 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int fall = Integer.parseInt(st.nextToken());                        // 오타위치 값 입력
            String temp [] = st.nextToken().split("");                     // 배열을 만들어서 바로 입력
            ArrayList<String> strArr = new ArrayList<>();                       // 배열안의 오타위치값을 제거하기 위해서 ArrayList 사용
            for (int j = 0; j < temp.length; j++){                              // 배열안의 문자를 ArrayList에 추가
                strArr.add(temp[j]);
            }
            strArr.remove(fall-1);                                          // ArrayList에서 인덱스값을 통하여 삭제
            String result = "";                                                  // 결과 출력을 위해서 변수 설정
            for (int k = 0; k < strArr.size(); k++){                             // ArrayList 안의 문자를 한줄로 출력을 위해서
                result += strArr.get(k);
            }
            System.out.println(result);
        }
    }
}
