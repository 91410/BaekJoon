package BaekJoon.Silver;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Number2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> arr = new ArrayList<Integer>();
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());      // 오름차순으로 정렬 할 갯수 받기

        for (int i = 0; i < num; i++){                  // 리스트에 정렬할 수를 추가
            arr.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arr);                          // 오름차순으로 정렬

        for (int i = 0; i < arr.size(); i++){           // 오름차순 순서대로 StringBuilder에 넣어서
            sb.append(arr.get(i) + "\n");
        }
        bw.write(sb.toString());                        // BufferedWriter로 출력
        bw.flush();
        bw.close();
    }
}
