package Bronze;

import java.util.Scanner;

public class Number2439 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= n - i; ++j) {
				System.out.printf(" ");
			}
			
			for(int j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			
			System.out.println();
		}
		
	}

}
