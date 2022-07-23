package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Number8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++){
            ArrayList<String> ox = new ArrayList<String>();
            int sum = 0;
            int count = 0;

            String temp = br.readLine();
            String tempArr [] = temp.split("");

            for (int j = 0; j < tempArr.length; j++){
                ox.add(tempArr[j]);
            }
            for (int k = 0; k < ox.size(); k++){
                if (ox.get(k).equals("O")){
                    count += 1;
                    sum += count;
                } else if(ox.get(k).equals("X")){
                    count = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
