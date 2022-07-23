package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Number1225 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String num1 [] = st.nextToken().split("");
        String num2 [] = st.nextToken().split("");
        long result = 0;                                    // int 초과하기 때문에 long사용

        for (int i = 0; i < num1.length; i++){
            for (int j = 0; j < num2.length; j++){
                result += Integer.parseInt(num1[i]) * Integer.parseInt(num2[j]);
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
