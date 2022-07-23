package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Number2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 1; i <= testCase; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int re = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            ArrayList<String> reStr = new ArrayList<String>();
            String tempArr[] = str.split("");

            for (int j = 0; j < tempArr.length; j++){
                for (int k = 1; k <= re; k++){
                    reStr.add(tempArr[j]);
                }
            }
            for (int j = 0; j < reStr.size(); j++){
                System.out.print(reStr.get(j));
            }
            System.out.println(" ");
        }
    }
}
