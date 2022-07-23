package Bronze;

import java.io.*;

public class Number2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int quarter = 0;
        int dime = 0;
        int nickel = 0;
        int penny = 0;

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++){
            int money = Integer.parseInt(br.readLine());

            if (money % 25 < 25){
                quarter = money / 25;
                money = money - (25 * quarter);
            }
            if (money % 10 < 10){
                dime = money / 10;
                money = money - (10 * dime);
            }
            if (money % 5 < 5){
                nickel = money / 5;
                money = money - (5 * nickel);
            }
            if (money % 1 < 1){
                penny = money / 1;
                money = money - (1 * penny);
            }
            bw.write(String.valueOf(quarter) + " " + String.valueOf(dime) + " " + String.valueOf(nickel) + " " + String.valueOf(penny));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
