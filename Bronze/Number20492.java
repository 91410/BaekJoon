package Bronze;

import java.util.Scanner;

public class Number20492 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a = (n/100)*78;
				
		int b = n-(n/100*20/100*22);
		
		System.out.println(a+" "+b);

	}

}
