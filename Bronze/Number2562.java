package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2562 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int[] arr = new int[9];
		
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
				
		int max = 0;
		int index = 0;
		
		for (int j = 0; j < 9; j++) {
			if (arr[j]>max) {
				max = arr[j];
				index = j+1;
			}
		}
		System.out.println(max);
		System.out.println(index);
		
	}

}
