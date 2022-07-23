package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        int numberCopy = number;
        int count = 0;

        while (true) {
            int num1 = numberCopy / 10;
            int num2 = numberCopy % 10;
            int num3 = num1 + num2;
            int num4 = num3 % 10;
            int newNum = (num2 * 10) + num4;

            count += 1;

            if (number == newNum) {
                System.out.println(count);
                break;
            } else {
                numberCopy = newNum;
            }
        }
    }
}
