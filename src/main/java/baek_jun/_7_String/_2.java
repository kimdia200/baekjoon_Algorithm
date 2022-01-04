package baek_jun._7_String;

import java.util.Scanner;

/**
 * URL:https://www.acmicpc.net/problem/11720
 *
 */
public class _2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int num = sc.nextInt();
		char[] ch = sc.next().toCharArray();
		
		int sum=0;
		for(int i=0; i<num; i++) {
			sum+=Integer.parseInt(String.valueOf(ch[i]));
		}
		System.out.println(sum);
		
	}
}
