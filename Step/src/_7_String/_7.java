package _7_String;

import java.util.Scanner;
/**
 * https://www.acmicpc.net/problem/2908
 *
 */
public class _7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//�Է� �޾Ƽ� �����ֱ�
		String[] arr = sc.nextLine().split("[ ]");
		
		//���� �� ��
		int max=Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(arr[i]);
			sb.reverse();
			if(max<Integer.parseInt(sb.toString()))
				max=Integer.parseInt(sb.toString());
		}
		System.out.println(max);
	}
}
