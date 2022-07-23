package Silver;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Number1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<String> hashSet = new HashSet<>();
        ArrayList<String> result = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int noListen = Integer.parseInt(st.nextToken());
        int noSee = Integer.parseInt(st.nextToken());

        for (int i = 0; i < noListen; i++){         // 2개중 한개를 hashset에 넣어주고
            hashSet.add(br.readLine());
        }
        for (int i = 0; i < noSee; i++){            // hashset에 다음(noSee)입력이 있는지 확인
            String str = br.readLine();
            if (hashSet.contains(str)){
                result.add(str);                    // 있다면 출력을 위해 만든 ArrayList에 추가
            }
        }
        Collections.sort(result);                   // 알파벳 순서대로이기에 정렬

        bw.write(String.valueOf(result.size()));        // 갯수를 출력하기위해서 ArrayList의 크기 출력
        bw.newLine();

        for (int i = 0; i < result.size(); i++){
            bw.write(result.get(i));
            bw.newLine();
        }
        bw.flush();
        bw.close();

    }
}
