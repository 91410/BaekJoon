package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number4493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++){
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            for (int j = 0; j < n; j++){
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                String p1 = st.nextToken();
                String p2 = st.nextToken();

                if (p1.equals("R") && p2.equals("P")){
                     count -= 1;
                } else if (p1.equals("R") && p2.equals("S")) {
                     count += 1;
                 } else if (p1.equals("P") && p2.equals("R")) {
                     count += 1;
                } else if (p1.equals("P") && p2.equals("S")) {
                    count -= 1;
                } else if (p1.equals("S") && p2.equals("R")) {
                    count -= 1;
                } else if (p1.equals("S") && p2.equals("P")) {
                    count += 1;
                }
            }
            if (count > 0){
                System.out.println("Player 1");
            } else if (count < 0) {
                System.out.println("Player 2");
            } else {
                System.out.println("TIE");
            }
        }
    }
}
