package _10_Recursive;

import java.util.Scanner;

/**
 * URL : https://www.acmicpc.net/problem/10870 
 *
 */
public class _2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		System.out.println(re(num));
	}
	public static int re(int a) {
		if(a<=0)
			return 0;
		else if(a==1)
			return 1;
		else
			return re(a-1)+re(a-2);
	}
}
