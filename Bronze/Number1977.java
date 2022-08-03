package Bronze;

import java.io.*;
import java.util.ArrayList;

public class Number1977 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int min = Integer.parseInt(br.readLine());
        int max = Integer.parseInt(br.readLine());
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= 100; i++){
            int num = i * i;
            if (num >= min && num <= max){
                arr.add(num);
                sum += num;
            }
        }
        if (arr.size() == 0){
            bw.write("-1");
        } else {
            bw.write(String.valueOf(sum));
            bw.newLine();
            bw.write(String.valueOf(arr.get(0)));
        }
       bw.flush();
       bw.close();
    }
}
