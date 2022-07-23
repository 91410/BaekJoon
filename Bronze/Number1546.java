package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Number1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Double> fArrList = new ArrayList<Double>();
        ArrayList<Double> fArrList2 = new ArrayList<Double>();

        double sum = 0;

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < t; i++){
            fArrList.add(Double.parseDouble(st.nextToken()));
        }

        double maxValue = Collections.max(fArrList);

        for (int i = 0; i < fArrList.size(); i++) {
            fArrList2.add( (fArrList.get(i) / maxValue) * 100 );
        }

        for (int i = 0; i < fArrList2.size(); i++) {
            sum += fArrList2.get(i);
        }
        System.out.println(sum / fArrList2.size());
    }
}
