package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number10707 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		int p = Integer.parseInt(br.readLine());
		
		int xSum = a * p;
		int ySum = 0;
		
		if(c >= p) {
			ySum = b;
		}else {
			ySum = b + ((p-c)*d);
		}
		
		if(xSum > ySum) {
			System.out.println(ySum);
		}else {
			System.out.println(xSum);
		}
	}
}
