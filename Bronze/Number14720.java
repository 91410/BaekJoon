package Bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Number14720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> milk = new ArrayList<>();
        int count = 0;
        int nextStore = 0;                              // 우유먹는 순서 유지 무조건 딸기부터 먹어야 하기 때문

        int store = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < store; i++){                                // 리스트에 추가
            milk.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < milk.size(); i++){
            if (milk.get(i) == 0 && nextStore == 0){            // 리스트와 순서대로 먹는지 확인인
                count++;
                nextStore = 1;
                continue;
            }
            if (milk.get(i) == 1 && nextStore == 1) {
                count++;
                nextStore = 2;
                continue;
            }
            if (milk.get(i) == 2 && nextStore == 2) {
                count++;
                nextStore = 0;
                continue;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();

    }
}
