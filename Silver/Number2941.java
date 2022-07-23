package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;                                                            // 문자 갯수 파악용
        String str [] = br.readLine().split("");                            // 입력 받은 문자를 한글자로 잘라서 배열에 

        for (int i = 0; i < str.length; i++){                                    // 배열 길이 만큼 반복
            if (str[i].equals("c") && i < str.length - 1){                       // 해당 문자가 나올때 마다 조건문 설정, 
                if (str[i + 1].equals("=") || str[i + 1].equals("-")){           // 배열길이 -1은 마지막에 해당글자가 오면 안되기 때문
                    i++;
                }
            } else if (str[i].equals("d") && i < str.length - 1) {
                if (str[i + 1].equals("z") && i < str.length - 2){
                    if (str[i + 2].equals("=")){
                       i = i + 2;
                    }
                } else if (str[i + 1].equals("-")) {
                    i++;
                }
            } else if (str[i].equals("l") && i < str.length - 1) {
                if (str[i + 1].equals("j")){
                    i++;
                }
            } else if (str[i].equals("n") && i < str.length - 1) {
                if (str[i + 1].equals("j")){
                    i++;
                }
            } else if (str[i].equals("s") && i < str.length - 1) {
                if (str[i + 1].equals("=")){
                    i++;
                }
            } else if (str[i].equals("z") && i < str.length - 1) {
                if (str[i + 1].equals("=")){
                    i++;
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
