package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2442 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int line = Integer.parseInt(br.readLine());
		int star = 1;		
		int space = line - 1;
		
		for(int i = 0; i < line; i++) {
			for(int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < star; k++) {
				System.out.print("*");
			}

			space -= 1;
			star += 2;
			System.out.println("");
		}
	}
}