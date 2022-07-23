package BaekJoon.Bronze;

import java.io.BufferedReader;		// �޴¿���
import java.io.BufferedWriter;		// ���
import java.io.IOException;			// ����ó��
import java.io.InputStreamReader;	// �޴¿���
import java.io.OutputStreamWriter;	// ���
import java.util.StringTokenizer;	// ����

public class Number15552 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		//���� �Է�
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		//���� ���

		int t = Integer.parseInt(br.readLine());	// int�� ����ȭ�Ͽ� ����
		
		StringTokenizer st;		//���ڿ��� �����ϱ� ���� ȣ��
		
		for(int i = 1; i <= t; i++) {
			st = new StringTokenizer(br.readLine());	//ȣ�� �Ѱ��� ���� ���ڿ��� �޾� 

			int a = Integer.parseInt(st.nextToken());	//���ڿ��� int�� ��ȯ
			int b = Integer.parseInt(st.nextToken());
			int sum = a + b;
			
			bw.write(sum+"\n");		//���
		}
		bw.flush();		// �����ִ°� ��� ���
		bw.close();		// ����
	}
}
