package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number5532 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int l = Integer.parseInt(br.readLine());
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		
		if(a % c == 0 || b % d == 0) {
			int kor = a / c;
			int math = b / d;
			if(kor > math) {
				System.out.println(l - kor);
			}else {
				System.out.println(l - math);
			}
		}else {
			int kor = (a / c) + 1;
			int math = (b / d) + 1;
			if(kor > math) {
				System.out.println(l - kor);
			}else {
				System.out.println(l - math);
			}
		}		
	}
}
