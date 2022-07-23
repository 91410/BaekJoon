package Bronze;

import java.util.Scanner;

public class Number10950 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);    
		
        int a = sc.nextInt();
        
        int b = 0;
        int c = 0;    
          
        for(int i = 1; i<=a; i++) {
        	b = sc.nextInt();
        	c = sc.nextInt();
        	System.out.println(b+c);
        }
	}
}
