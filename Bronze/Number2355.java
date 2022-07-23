package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2355 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(),"");
		
		long n = Integer.parseInt(st.nextToken());
		long m = Integer.parseInt(st.nextToken());
		
		if(m>n) {
			long tep = m;
			m = n;
			n = tep;
		}
				
		long sum = (n+m)*(n-m+1)/2;
		
		System.out.println(sum);		
	}

}
