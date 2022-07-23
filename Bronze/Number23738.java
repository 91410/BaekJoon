package BaekJoon.Bronze;

import java.io.*;
import java.util.Locale;

public class Number23738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputStr  [] = br.readLine().split("");      // 한글자 단위로 짤라서 배열로 넣어주기

        String output = "";                                         // 출력용
        for (int i = 0; i < inputStr.length; i++){                  // 문자 길이만큼 반복
            if (inputStr[i].equals("B")){
                output += "v";
            } else if (inputStr[i].equals("E")) {
                output += "ye";
            } else if (inputStr[i].equals("H")) {
                output += "n";
            } else if (inputStr[i].equals("P")) {
                output += "r";
            } else if (inputStr[i].equals("C")) {
                output += "s";
            } else if (inputStr[i].equals("Y")) {
                output += "u";
            } else if (inputStr[i].equals("X")) {
                output += "h";
            } else {
                output += inputStr[i].toLowerCase(Locale.ROOT);         // 소문자 출력을 위해서 사용
            }
        }
        bw.write(output);
        bw.flush();
        bw.close();
    }
}
