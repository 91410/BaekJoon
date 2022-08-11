package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Number22864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int fatigue = Integer.parseInt(st.nextToken());
        int work = Integer.parseInt(st.nextToken());
        int rest = Integer.parseInt(st.nextToken());
        int limit = Integer.parseInt(st.nextToken());
        int sumFatigue = 0;     // 피로도 합
        int sumWork = 0;        // 총 공수

        for (int i = 0; i < 24; i++){
            if (limit >= sumFatigue + fatigue){
                sumWork += work;
                sumFatigue += fatigue;
            } else if (limit <= sumFatigue + fatigue) {
                sumFatigue -= rest;
                if (sumFatigue <= 0){   // 휴식시 음수가 되면 0으로 반환
                    sumFatigue = 0;
                }
            }
        }
        bw.write(String.valueOf(sumWork));
        bw.flush();
        bw.close();

    }
}
