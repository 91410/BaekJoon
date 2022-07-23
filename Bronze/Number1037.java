package Bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Number1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> numArr = new ArrayList<>();              // 약수들의 모음


        int num = Integer.parseInt(br.readLine());                  // 약수들의 종 갯수
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++){
            numArr.add(Integer.parseInt(st.nextToken()));           // 약수를 리스트에 추가
        }
        Collections.sort(numArr);                                   // 정렬, 약수중 가장 작은것과 큰것을 곱하면 원래 숫자 나옴

        int result = numArr.get(0) * numArr.get(numArr.size() - 1);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
