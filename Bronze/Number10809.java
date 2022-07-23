package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Number10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String testStr = br.readLine();

        char charArr[] = testStr.toCharArray();
        ArrayList<Integer> intList = new ArrayList<Integer>();

        for (int i = 0; i < charArr.length; i++){
            intList.add((int)charArr[i]);
        }
        for (int i = 97; i < 123; i++){
            System.out.print(intList.indexOf(i) + " ");
        }
    }
}
