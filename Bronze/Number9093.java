package BaekJoon.Bronze;

import java.io.*;


public class Number9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());     

        for (int i = 0; i < testCase; i++){                     // 전체 문장 갯수만큼 반복
            String temp [] = br.readLine().split(" ");      // 뛰어쓰기 단위로 잘라서 배열
            for (int j = 0; j < temp.length; j++){                 
                if (temp[j].length() == 1){                     // 배열의 크기가 하나일 경우
                    sb.append(temp[j]);                         
                    sb.append(" ");                             // 뛰어쓰기 단위로 잘라서 뛰어쓰기가 없기 때문에
                } else {
                    String temp2 [] = temp[j].split("");    // 한글자가 아닌 경우, 한글자 단위로 잘라서 배열
                    for (int k = temp2.length - 1; k >= 0; k--){    // 배열의 마지막부터 StringBuilder로 
                        sb.append(temp2[k]);
                    }
                    sb.append(" ");
                }
            }
        sb.append("\n");                                            // 다음문장을 위해 줄바꿈
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
