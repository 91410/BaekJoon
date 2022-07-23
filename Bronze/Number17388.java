package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Number17388 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int s = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int sum = s + k + h;

        int min =  Math.min(s, Math.min(k, h));     // 최저진행 확인

        if (100 <= sum){
            bw.write("OK");
        } else {
            if (min == s){
                bw.write("Soongsil");
            } else if (min == k) {
                bw.write("Korea");
            } else if (min == h) {
                bw.write("Hanyang");
            }
        }
        bw.flush();
        bw.close();
    }
}
