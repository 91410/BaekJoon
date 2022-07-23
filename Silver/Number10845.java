package Silver;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class Number10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque deque = new LinkedList<>();                   // 가장 뒤에 있는 정수를 출력하기 위해서 덱 선택
        // 양쪽에서 입력 삭제 가능
        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++){                 // 입력받은 정수만큼 반복문 수행하고 조건에 맞는것을 출력
            String temp = br.readLine();
            if (temp.contains("push")){
                String arr [] = temp.split(" ");
                deque.add(arr[1]);
            } else if (temp.equals("pop")) {
                if (deque.size() == 0){
                    bw.write(String.valueOf(-1));
                    bw.newLine();
                } else if (deque.size() != 0) {
                    bw.write(String.valueOf(deque.poll()));
                    bw.newLine();
                }
            } else if (temp.equals("size")){
                bw.write(String.valueOf(deque.size()));
                bw.newLine();
            } else if (temp.equals("empty")) {
                if (deque.size() == 0){
                    bw.write(String.valueOf(1));
                    bw.newLine();
                } else if (deque.size() != 0) {
                    bw.write(String.valueOf(0));
                    bw.newLine();
                }
            } else if (temp.equals("front")) {
                if (deque.size() == 0){
                    bw.write(String.valueOf(-1));
                    bw.newLine();
                } else if (deque.size() != 0) {
                    bw.write(String.valueOf(deque.peek()));
                    bw.newLine();
                }
            } else if (temp.equals("back")) {
                if (deque.size() == 0){
                    bw.write(String.valueOf(-1));
                    bw.newLine();
                } else if (deque.size() != 0) {
                    bw.write(String.valueOf(deque.peekLast()));
                    bw.newLine();
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
