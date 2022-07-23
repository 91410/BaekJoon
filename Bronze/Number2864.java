package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Number2864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String num1Max = "0";
        String num1Min = "0";
        String num2Max = "0";
        String num2Min = "0";

        String num1Arr [] = st.nextToken().split("");
        String num2Arr [] = st.nextToken().split("");

        for (int i = 0; i < num1Arr.length; i++){
            if (num1Arr[i].equals("5") || num1Arr[i].equals("6")){
                num1Max += "6";
                num1Min += "5";
            } else {
                num1Max += num1Arr[i];
                num1Min += num1Arr[i];
            }
        }
        for (int i = 0; i < num2Arr.length; i++){
            if (num2Arr[i].equals("5") || num2Arr[i].equals("6")){
                num2Max += "6";
                num2Min += "5";
            } else {
                num2Max += num2Arr[i];
                num2Min += num2Arr[i];
            }
        }
        int max = Integer.parseInt(num1Max) + Integer.parseInt(num2Max);
        int min = Integer.parseInt(num1Min) + Integer.parseInt(num2Min);

        bw.write(String.valueOf(min) + " " + String.valueOf(max));
        bw.flush();
        bw.close();
    }
}
