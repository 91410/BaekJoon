package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Number3052 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        ArrayList<Integer> remainderArr = new ArrayList<Integer>();
//        ArrayList<Integer> answerArr = new ArrayList<Integer>();
//
//        for (int i = 0; i < 10; i++){
//            remainderArr.add(Integer.parseInt(br.readLine()) % 42);
//        }
//
//        for(int i = 0; i <remainderArr.size(); i++) {
//            if(!answerArr.contains(remainderArr.get(i))) {
//                answerArr.add(remainderArr.get(i));
//            }
//        }
//
//        System.out.println(answerArr.size());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int i = 0; i < 10; i++){
            hashSet.add(Integer.parseInt(br.readLine()) % 42);
        }
        System.out.println(hashSet.size());
    }
}
