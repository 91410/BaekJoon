package Bronze;

import java.io.*;

public class Number10987 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str [] = br.readLine().split("");
        int count = 0;

        for (int i = 0; i < str.length; i++){
            if (str[i].equals("a") || str[i].equals("e") || str[i].equals("i") || str[i].equals("o") || str[i].equals("u")){
                count++;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
