package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Number10797 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        int count = 0;
        ArrayList<Integer> car = new ArrayList<Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 5; i++){
            int temp = Integer.parseInt(st.nextToken());
            car.add(temp);
        }

        for (int i = 0; i < car.size(); i++){
            if(car.get(i) == number) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
