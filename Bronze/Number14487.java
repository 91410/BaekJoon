package Bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Number14487 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> rootArr = new ArrayList<>();

        int sum = 0;                                // 금액의 합계값 출력
        int root = Integer.parseInt(br.readLine()); // 가야하는 마을 수

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < root; i++){             // 통과비용 리스트에 추가
            rootArr.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(rootArr);          // 정렬하여서 마지막에 가장 큰 금액 설치

        for (int i = 0; i <rootArr.size() - 1; i++){    // 마지막 금액을 제외하고 더하기
            sum += rootArr.get(i);
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
