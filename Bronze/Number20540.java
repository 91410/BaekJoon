package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number20540 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String mbti = br.readLine();

        String[] mbtiArray = mbti.split("");
        String result = "";

        if(mbtiArray[0].equals("E")){
            result += "I";
        } else{
            result += "E";
        }
        if(mbtiArray[1].equals("N")){
            result += "S";
        }else{
            result += "N";
        }
        if(mbtiArray[2].equals("T")){
            result += "F";
        }else{
            result += "T";
        }
        if(mbtiArray[3].equals("J")){
            result += "P";
        }else{
            result += "J";
        }

        System.out.println(result);
    }
}
