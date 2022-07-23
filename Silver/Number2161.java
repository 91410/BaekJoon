package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Number2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> card = new LinkedList<Integer>();            // Queue 선언
        ArrayList<Integer> collect = new ArrayList<Integer>();      // 출력을 위해서 선언, 버리는 카드 모으는 용도

        int testCase = Integer.parseInt(br.readLine());             // 입력받기 = 카드 수

        for (int i = 1; i <= testCase; i++){                        // Queue에 입력 받은 카드수 만큼 값 추가
            card.add(i);                                            // add 값 추가, element -> 맨 앞의 있는 요소는 반환, peek -> 맨앞에 있는 요소 반환
        }
        while (true){                                               // 입력 받는 수가 커도 모두 뽑아낼 수 있게 무한반복 수행
            if (collect.size() == testCase){                        // Queue에 있는 값을 모두 뽑아내면 무한반복 종료
                break;
            }
            collect.add(card.poll());                               // poll -> 제일먼저 들어간 값 버리기, 버린거를 collect에 모아 놓기
            card.offer(card.poll());                                // offer -> Queue의 맨뒤로 이동, 버린것 다음것을 맨뒤로 이동 시키기 위해서
        }
        for (int i = 0; i < collect.size(); i++){                   // 버린순서대로 출력하기 위해서 작성
            System.out.print(collect.get(i));
            System.out.print(" ");                                  // 출력형식 때문에 작성
        }                                                           // remove 맨 앞에 있는 요소 제거
    }
}
