package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int height = Integer.parseInt(st.nextToken());                  // 층
            int width = Integer.parseInt(st.nextToken());                   // 호
            int person = Integer.parseInt(st.nextToken());                  // 순번
            int floor = 0;
            int ho = 0;

            if (person % height == 0){                                      // 층의 배수와 같을때는 제일 위층이 지정
                ho = person / height;                                       // 배수 상태이면 묶이 호수가 되고
                floor = height * 100;                                       // 제일 위층이 지정 되기에 층은 높이와 같음
            } else {                                                        // 다를때
                floor = person % height * 100;                              // 층은 나머지
                ho = (person / height) + 1;                                 // 호수는 묶 + 1
            }
            System.out.println(floor + ho);
        }
    }
}
