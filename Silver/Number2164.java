package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Number2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> card = new LinkedList<>();                                   // 먼저 들어온 것이 먼저 나가기에 큐 선택

        int num = Integer.parseInt(br.readLine());                                  // 입력값

        for (int i = 1; i <= num; i++){                                             // 1에서부터 입력값까지 큐에 넣기
            card.add(i);
        }
        while (card.size() != 1){                                                   //  큐의 크기가 1일 될때까지 조건 반복
            card.poll();                                                            // 제일 앞의 숫자 버리기
            card.offer(card.poll());                                                // 제일 앞의 숫자를 뒤로 보내기
        }
        System.out.println(card.peek());

    }
}
