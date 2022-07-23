package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Number1076 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> resistor = new HashMap<String, Integer>();

        resistor.put("black", 0);
        resistor.put("brown", 1);
        resistor.put("red", 2);
        resistor.put("orange", 3);
        resistor.put("yellow", 4);
        resistor.put("green", 5);
        resistor.put("blue", 6);
        resistor.put("violet", 7);
        resistor.put("grey", 8);
        resistor.put("white", 9);

        int one = resistor.get(br.readLine()) * 10;
        int two = resistor.get(br.readLine());
        int sum = one + two;
        long three = resistor.get(br.readLine());

        if (three == 0){
            three = 1;
        } else if (three != 0) {
            for (int i = 1; i < 10; i++){
                if (three == i){
                    three = (long)Math.pow(10,i);
                }
            }
        }
        System.out.println(sum * three);
    }
}
