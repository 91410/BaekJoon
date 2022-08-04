package Silver;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Number11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> coinList = new ArrayList<>();
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int coin = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());

        for (int i = 0; i < coin; i++){
            coinList.add(Integer.parseInt(br.readLine()));
        }

        for (int i = coin - 1; i >= 0; i--){
            if (money / coinList.get(i) >= 1){
                result = result + (money / coinList.get(i));
                money = money - (coinList.get(i) * (money / coinList.get(i)));
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
