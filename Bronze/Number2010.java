package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Number2010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> com = new ArrayList<Integer>();                          // 입력받을 만큼 저장하기 위해서 사용
        int result = 0;                                                             // 출력 받을 변수 설정
        int muti = Integer.parseInt(br.readLine());                                 // 입력값 중 갯수

        for (int i = 0; i < muti; i++){                                             // 리스트에 입력받을 갯수 만큼 넣어주기
            com.add(Integer.parseInt(br.readLine()));
        }
        for (int i = 0; i < com.size(); i++){                                       // 입력받은만큼 리스트 사이즈를 통해 뽑아내고 값을 변수에 저장
            result += com.get(i);
        }
        System.out.println(result - (com.size() - 1));                              // 마지막 멀티탭을 제외하고 하나씩 연결해야하기에 리스트사이즈 보다 -1 설정하여 차감
    }
}
