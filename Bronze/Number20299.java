package BaekJoon.Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Number20299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int team = Integer.parseInt(st.nextToken());                // 참가 팀 수
        int sum_Min = Integer.parseInt(st.nextToken());             // 팀 가입 가능한 최소 점수
        int person_Min = Integer.parseInt(st.nextToken());          // 개인의 최소 점수

        int teamSum = 0;                                                // 팀 합계 점수
        int teamCount = 0;                                              // 가입가능한 팀 수
        StringBuilder sb = new StringBuilder();                      // 빈 문자열로 할시 시간초과 나옴

        for (int i = 0; i < team; i++){
            st = new StringTokenizer(br.readLine()," ");

            int a = Integer.parseInt(st.nextToken());               //  각 팀원 점수
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a >= person_Min && b >= person_Min && c >= person_Min){     // 모든 팀원이 개인 최소 점수를 넘는지 확인
                teamSum = a + b + c;                                        // 팀 합계 점수
                if (teamSum >= sum_Min){                                    // 팀 합계 점수가 가입가능 점수 넘는지 확인
                    teamCount++;
                    sb.append(a + " " + b + " " + c + " ");
                }
            }
        }
        bw.write(String.valueOf(teamCount));
        bw.newLine();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
