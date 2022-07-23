package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number10156 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] strs = br.readLine().split(" ");
		
		int k = Integer.parseInt(strs[0]);
		int n = Integer.parseInt(strs[1]);
		int m = Integer.parseInt(strs[2]);
		
		int price = k * n;
		int need = price - m;
		
		if(m >= price){
			System.out.println(0);
		}else {
			System.out.println(need);
		}
	}
}
