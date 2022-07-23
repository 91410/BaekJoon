package BaekJoon.Bronze;

import java.util.Scanner;
public class Number2475 {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();

		int sum = 0;

		int arr[] = {a,b,c,d,e};

		for(int i = 0; i <= 4; i++) {
			sum += arr[i]*arr[i];
		}
		System.out.println(sum%10);

	}
}
