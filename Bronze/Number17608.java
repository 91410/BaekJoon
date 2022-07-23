package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Number17608 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        ArrayList<Integer> stack = new ArrayList<Integer>();
        int count = 1;

        for (int i = 0; i < testCase; i++){
            stack.add(Integer.parseInt(br.readLine()));
        }

        int hight = stack.get(testCase-1);

        for (int i = testCase - 2; i >= 0; i--){
            if (stack.get(i) > hight){
                hight = stack.get(i);
                count += 1;
            }
        }
        System.out.println(count);
    }
}
