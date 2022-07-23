package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Number13866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
        ArrayList<Integer> level = new ArrayList<>();                               //리스트 사용

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");          // 한줄로 입력되는것을 나누기 위해
        for (int i = 0; i < 4; i++) {                                               // 4개로 들어온다고 주어 주었고 나누어진 것을 리스트에 넣기
            level.add(Integer.parseInt(st.nextToken()));
        }
        int a = level.get(3) + level.get(0);                                        // 오른차순으로 들어온다고 하여 정렬을 안시키고 배열 순서 대로 더하기
        int b = level.get(2) + level.get(1);

        System.out.println(Math.abs(a - b));                                        // b가 더 클수 있기 때문에 절대값 사용
    }
}
