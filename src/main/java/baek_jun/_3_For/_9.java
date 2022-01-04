package baek_jun._3_For;

import java.util.Scanner;

public class _9 {
/**
 * https://www.acmicpc.net/problem/2438
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
