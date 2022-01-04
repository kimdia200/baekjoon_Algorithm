package baek_jun._7_String;

import java.util.Scanner;

/**
 * URL:https://www.acmicpc.net/problem/2675
 *
 */
public class _4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		String s = sc.nextLine();
		
		for(int i=0; i<s.length();i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(s.charAt(i));
			}
		}
		
	}
}
