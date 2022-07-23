package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Number2502 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");   // 바로 한줄에 빈칸으로 입력 되기 때문에
        ArrayList<Integer> result = new ArrayList<>();                      // 약수를 오름차순으로 저장하기 위해서 

        int num = Integer.parseInt(st.nextToken());                         // 따로 변수로 설정하는것이 더 유용하다고 생각하여서 각각 변수처리
        int min = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= num; i++){                                     // 1에서 num까지 나머지가 0인것을 오름차순으로 리스트에 넣기 
            if (num % i == 0){
                result.add(i);
            }
        }
        if (result.size() < min){                                           // 몆번째 것을 요청하였기에 약수가 그 크기 만큼 없다면 0으로 출력
            System.out.println(0);
        } else if (result.size() >= min) {                                  // 크기가 넘어가면 리스트가 0부터 시작하기에 min -1 로 출력
            System.out.println(result.get(min-1));
        }
    }
}
