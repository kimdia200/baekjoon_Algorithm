package baek_jun._7_String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		StringTokenizer token = new StringTokenizer(s," ");
		System.out.println(token.countTokens());
	}
}
