package Step02;

import java.util.Scanner;

//ū�� ����ϱ�
public class _01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] arr= new int[cnt];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(arr[0]);
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>arr[i-1]) {
				sb.append(" ");
				sb.append(arr[i]);
			}
		}
		System.out.println(sb.toString());
	}
}
