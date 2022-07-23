package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Number4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            ArrayList<Integer> intArr = new ArrayList<Integer>();
            intArr.add(Integer.parseInt(st.nextToken()));

            for (int j = 0; j < intArr.get(0); j++){
                intArr.add(Integer.parseInt(st.nextToken()));
            }

            double avg = 0;

            for (int j = 1; j <= intArr.get(0); j++){
                avg += intArr.get(j);
            }
            avg = avg / intArr.get(0);

            double count = 0;

            for (int j = 1; j <= intArr.get(0); j++){
                if (avg < intArr.get(j)){
                    count += 1;
                }
            }
            System.out.println(String.format("%.3f", count / intArr.get(0) * 100) + "%");
        }
    }
}
