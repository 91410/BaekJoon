package Bronze;

import java.util.Scanner;

public class Number10039 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		int arr [] = {a, b, c, d, e};
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] <= 40) {
				sum = sum+40;
			}else {
				sum =sum+arr[i];
			}
		}
		System.out.println(sum/5);
	}
}