package Bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Number2845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> news = new ArrayList<>();

        int persen = Integer.parseInt(st.nextToken());
        int size = Integer.parseInt(st.nextToken());
        int sum = persen * size;                                // 총인원수

        st = new StringTokenizer(br.readLine());                // 입력 다음줄을 위해서
        for (int i = 0; i < 5; i++){
            news.add(Integer.parseInt(st.nextToken()));         // 뉴스 인원을 리스트에 넣기
        }

        for (int i = 0; i < news.size(); i++){
            bw.write(String.valueOf(news.get(i) - sum));    // 뉴스인원수에서 총인원수 빼기
            if (i < 4){                                         // 마지막에는 뛰어쓰기 넣지않기 위해서
                bw.write(" ");
            }
        }
        bw.flush();
        bw.close();
    }
}
