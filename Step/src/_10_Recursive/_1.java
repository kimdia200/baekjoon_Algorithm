package _10_Recursive;

import java.util.Scanner;

/**
 * URL : https://www.acmicpc.net/problem/10872
 */
public class _1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("정수 N(0 ≤ N ≤ 12)을 입력하세요 : ");
			n=sc.nextInt();
		}while(n<0 | n>12);
		System.out.println(rec(n));
	}
	
	public static int rec(int n) {
		if(n<=1)
			return 1;
		else
			return n*rec(n-1);
	}
}
