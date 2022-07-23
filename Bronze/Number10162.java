package Bronze;

import java.io.*;

public class Number10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int time = Integer.parseInt(br.readLine());

        int five = 0;
        int one = 0;
        int sec = 0;

        while (true){
            if (time >= 300){                   // 300초 보다 크면 카운트 올려주고, 시간에서 300 빼기
                five++;
                time = time - 300;
            } else if (time < 300){             // 300보다 작을때,
                if (time >= 60){                // 60초 카운트 올려주고 빼기
                    one++;
                    time = time - 60;
                } else if (time < 60){
                    if (time >= 10){            // 10초 카운트 올려주고 빼기
                        sec++;
                        time = time - 10;
                    }
                }
            }
            if (time == 0){                     // 타임이 0이 되면 출력
                bw.write(String.valueOf(five) + " " + String.valueOf(one) + " " + String.valueOf(sec));
                bw.flush();
                bw.close();
                break;
            } else if (time < 10) {             // 10단위보다 작을때 -1 출력력                bw.write("-1");
                bw.flush();
                bw.close();
                break;
            }
        }
    }
}
