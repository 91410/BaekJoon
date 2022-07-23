package Bronze;

import java.io.*;

public class Number11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            String str = br.readLine();
            if (str == null){
                break;
            } else {
                bw.write(br.readLine());
                bw.newLine();
            }
        }

    }
}
